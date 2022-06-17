package com.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.email.model.Email;

@RestController
@RequestMapping("/email")
public class EmailController {
	
	private static final String MESSAGE_QUEUE = "message_queue";
	
	@Autowired
	JmsTemplate template;
	
	@GetMapping
	public String viewMail() {
		
		System.out.println("EmailController - Email View");		
		return "View Email";
		
	}
	@PostMapping
	public String sendMail() {
		
		// Get JMS template bean reference
				for (int i = 1; i <= 10; i++)
				{
					Email email = new Email();
					email.setName("MYemail1"+i);
								// Send a message
					System.out.println("Sending a product " + i);
					template.convertAndSend(MESSAGE_QUEUE, email);
				}
			

		System.out.println("EmailController - Email sent");		
		return "Email sent";
		
	}

}
