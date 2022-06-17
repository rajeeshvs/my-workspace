package com.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@FeignClient(url = "http://EMAIL-SERVICE/email", name ="EmailClient")

public interface EmailApi {
	
	@RequestMapping(method = RequestMethod.GET)
    String viewMail();
    
	@RequestMapping(method=RequestMethod.POST)
    String sendMail();
     

}
