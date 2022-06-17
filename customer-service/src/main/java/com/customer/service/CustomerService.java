package com.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.CustomerRepository;
import com.customer.CustomerVO;

@Service      //Bean

public class CustomerService {
	
	
	@Autowired
	CustomerRepository customerRepository;
	
	public String addCustomer(CustomerVO customer) {
		
		System.out.println(customer.toString());
		System.out.println(customer.getCustomerName());
		customerRepository.save(customer);
		
		return "customer added";
		
	}

}
