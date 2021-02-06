package com.account.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.dao.AccountRepository;
import com.account.dto.AccountDTO;
import com.account.mapper.AccountMapper;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private AccountMapper accountMapper;;
	
	public List<AccountDTO> findAllAccounts(){
		return accountRepository.findAll().stream().map(accountMapper::AccountToAccountDTO).collect(Collectors.toList());
	}
}
