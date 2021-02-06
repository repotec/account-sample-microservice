package com.account.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.account.service.AccountService;

@RestController
public class AccountInfoController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(path="/accounts", method=RequestMethod.GET)
	public ResponseEntity<?> getAllAccounts() {
		return new ResponseEntity<>(accountService.findAllAccounts(), HttpStatus.OK);
	}
}
