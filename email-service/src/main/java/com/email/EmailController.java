package com.email;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {	
	
	@GetMapping
	public String viewMail() {
		
		System.out.println("EmailController - Email View");		
		return "View Email";
		
	}
	@PostMapping
	public String sendMail() {
		
		System.out.println("EmailController - Email sent");		
		return "Email sent";
		
	}

}
