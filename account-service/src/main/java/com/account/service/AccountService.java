package com.account.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.account.AccountRepository;
import com.account.AccountVO;

@Service    //Bean


public class AccountService {
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	RestTemplate template;
	
	public String addAccount(AccountVO accountVO) {
		
		ResponseEntity<String> response = template.getForEntity("http://localhost/8080/ustomer", String.class);
		accountRepository.save(accountVO);
		return "Account added";
	}
	
	public Optional<AccountVO> getAccount(int accountno){
		return accountRepository.findById(accountno);
				
	}

}
