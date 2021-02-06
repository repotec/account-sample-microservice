package com.account.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.account.model.Account;

public interface AccountRepository extends CrudRepository<Account, String> {
	List<Account> findAll();
}
