package com.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.order.EmailApi;
import com.order.OrderRepository;
import com.order.OrderVO;

@Service    //Bean
public class OrderService {
	
	
	
@Autowired
OrderRepository orderRepository;
@Autowired
RestTemplate template;

@Autowired
EmailApi emailclient;
	
	public void saveOrder(OrderVO order) {		
		
		//ResponseEntity<String> response = template.getForEntity("http://localhost:8081/email", String.class);
		ResponseEntity<String> response = template.getForEntity("http://EMAIL-SERVICE/email", String.class);
		System.out.println(response.getBody());
		// String email = emailclient.sendMail();
		 //System.out.println(email);
	        //System.out.println(emailclient.sendMail());
		orderRepository.save(order);		
		System.out.println("In Service - saveorder");
	}
	
	public List<OrderVO> getOrders(	) {
		//RestTemplate template = new RestTemplate();
		//ResponseEntity<String> response = template.getForEntity("http://localhost:8081/email", String.class);
		ResponseEntity<String> response = template.getForEntity("http://EMAIL-SERVICE/email", String.class);
		System.out.println(response.getBody());		
		//String email = emailclient.viewMail();
		// System.out.println(email);
	        //System.out.println(emailclient.viewMail();
		return orderRepository.findAll();
	}

}

