package com.order.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.email.model.Email;

@Component
public class MessageReceiver {
	private static final String MESSAGE_QUEUE = "message_queue";

	@JmsListener(destination = MESSAGE_QUEUE)
	public void receiveMessage(Email product) {
		System.out.println("Received " + product);
//		throwexception(product);
	}

//	private void throwexception(Email product) {
//		if (product.getQuantity() % 2 == 0) {
//			throw new RuntimeException();
//		}
//	}
}
