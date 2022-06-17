package com.order.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.order.OrderVO;
import com.order.service.OrderService;



/**
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@PostMapping
	public void createOrder(@Valid @RequestBody OrderVO order) {	
		System.out.println("createOrder - controller");
		service.saveOrder(order);
		System.out.println("working - controller");
		
	}
	
	@GetMapping
	public List<OrderVO> getOrders() {
		
		return service.getOrders();
		
	}

}
