package com.polligonalApps.rabbitmqExample.api;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.polligonalApps.rabbitmqExample.dto.MessageDTO;
import com.polligonalApps.rabbitmqExample.queue.QueueSender;

@RestController
public class HelloResource {

	
	@Autowired
	private QueueSender sender;
	
	@GetMapping("/enviar")
	public ResponseEntity sender() {
		List<MessageDTO> mensagens = new ArrayList<>();
		for(int i =0 ;i<200;i++) {
			UUID uuid = UUID.randomUUID();
			mensagens.add(new MessageDTO(uuid.toString()));
			sender.send(uuid.toString());
		}
		return ResponseEntity.ok(mensagens);
	}
}
