package com.hk.ks.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hk.ks.dao.AccountRepository;
import com.hk.ks.entities.Account;
import com.hk.ks.entities.UserDetailsCustom;

@Service
public class UserDetailsServiceCustom implements UserDetailsService {
	
	@Autowired
	AccountRepository accountRepo;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<Account> account = accountRepo.findByUserName(userName);
		
		account.orElseThrow(() -> new UsernameNotFoundException("User name not found"));
		
		return account.map(UserDetailsCustom::new).get();
	}

}
