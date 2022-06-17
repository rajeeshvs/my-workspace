package com.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

import com.email.model.Email;
@EnableEurekaClient
@SpringBootApplication

@EnableJms

public class EmailServiceApplication {

//private static final String MESSAGE_QUEUE = "message_queue";
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(EmailServiceApplication.class, args);
		// Get JMS template bean reference
		JmsTemplate template = context.getBean(JmsTemplate.class);

//		for (int i = 1; i <= 10; i++)
//		{
//			Email email = new Email();
//			email.setName("MYemail1"+i);
//						// Send a message
//			System.out.println("Sending a product " + i);
//			template.convertAndSend(MESSAGE_QUEUE, email);
//		}
	
	}

}
