package com.account;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping
	public Optional<AccountVO> getAccount(int accountno) {
		
		return accountService.getAccount(accountno);
		
	}
	
	@PostMapping
	public String addAccount(@Valid @RequestBody AccountVO accountVO) {
		
		return null;
	}
	

}
