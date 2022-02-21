package com.polligonalApps.rabbitmqExample;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.polligonalApps.rabbitmqExample.queue.QueueSender;

@SpringBootApplication
public class RabbitmqExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqExampleApplication.class, args);
		/*for(int i =0 ;i<200;i++) {
			UUID uuid = UUID.randomUUID();
			sender.send(uuid.toString());
		}*/
	}

}
