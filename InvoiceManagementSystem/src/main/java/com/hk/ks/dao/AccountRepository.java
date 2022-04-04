package com.hk.ks.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hk.ks.entities.Account;
import com.hk.ks.entities.UserDetailsCustom;

public interface AccountRepository extends JpaRepository<Account, Long> {
	
	<S extends UserDetailsCustom> S save(S entity);
	
	Optional<Account> findByUserName (String username);

}
