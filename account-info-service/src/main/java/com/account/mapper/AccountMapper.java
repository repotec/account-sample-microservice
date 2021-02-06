package com.account.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.account.dto.AccountDTO;
import com.account.model.Account;

@Mapper(componentModel = "spring")
public interface AccountMapper {
	@Mapping(target="accountNumber", source="accountNumber")
	@Mapping(target="firstName", source="firstName")
	@Mapping(target="lastName", source="lastName")
	@Mapping(target="balance", source="balance")
	AccountDTO AccountToAccountDTO(Account account);
}
