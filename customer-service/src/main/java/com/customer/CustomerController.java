package com.customer;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")

public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping
	public String createCustomer(@Valid @RequestBody CustomerVO customer) {
		
		String resp = customerService.addCustomer(customer);
		return resp;
	}
	@GetMapping()
	public String getFiles() {
		
		return null;
	}
	@GetMapping("/files")
	public String getFiles(String custId) {
		
		return null;
	}

}
