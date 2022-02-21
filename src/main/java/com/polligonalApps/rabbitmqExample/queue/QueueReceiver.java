package com.polligonalApps.rabbitmqExample.queue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class QueueReceiver {

	@RabbitListener(queues = {"${queue.name}"})
	public void receive(@Payload String uuid) {
		System.out.println("Mensagem recebida:"+uuid);
	}
}
