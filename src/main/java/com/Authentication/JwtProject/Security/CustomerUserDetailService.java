package com.Authentication.JwtProject.Security;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import com.Authentication.JwtProject.models.AppUser;
import com.Authentication.JwtProject.repositories.UserRepository;

@Service
public class CustomerUserDetailService implements UserDetailsService{
	
	@Autowired
	private UserRepository user_repo;
	
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		AppUser user = user_repo.findByEmail(email).orElseThrow(() -> 
		new UsernameNotFoundException("User not found"));
		
		return new User(user.getEmail(),user.getPassword(), Collections.emptyList());
	}

}
