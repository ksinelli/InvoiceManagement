package com.hk.ks.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hk.ks.dao.AccountRepository;
import com.hk.ks.entities.UserDetailsCustom;

@Service
public class AccountService {
	
	@Autowired
	AccountRepository accountRepo;
	
	@Autowired
	BCryptPasswordEncoder bCryptEncoder;
	
	public void saveAccount(String username, String password) {
		
		UserDetailsCustom account = new UserDetailsCustom(username.toLowerCase(), bCryptEncoder.encode(password));
		
		accountRepo.save(account);
		
	}
}
