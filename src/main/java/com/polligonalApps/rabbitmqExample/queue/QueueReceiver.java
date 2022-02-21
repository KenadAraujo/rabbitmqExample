package com.polligonalApps.rabbitmqExample.queue;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class QueueReceiver {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	private Queue queue;

	@RabbitListener(queues = {"${queue.name}"})
	public void receive(@Payload String uuid) {
		System.out.println("Mensagem recebida:"+uuid);
	}
	
}
