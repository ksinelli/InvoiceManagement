package com.hk.ks.entities;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsCustom implements UserDetails {
	
	private String userName;
	private String password;
	private boolean isActive;
	private List<GrantedAuthority> authorities;

	public UserDetailsCustom (String userName) {
		this.userName = userName;
	}
	
	public UserDetailsCustom () {

	}
	
	public UserDetailsCustom(Account account) {
		this.userName = account.getUserName();
		this.password = account.getPassword();
		this.isActive = account.isActive();
		this.authorities = Arrays.stream(account.getRoles().split(","))
								.map(SimpleGrantedAuthority::new)
								.collect(Collectors.toList());
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}


//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
//	}
}
