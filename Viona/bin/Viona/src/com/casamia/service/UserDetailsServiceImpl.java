package com.casamia.service;

import java.util.Base64;
import java.util.Base64.Encoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casamia.bean.LoginBean;
import com.casamia.entity.Loan;
import com.casamia.entity.User;
import com.casamia.repo.UserDetailsRepo;
import com.casamia.repo.UserDetailsRepoImpl;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
@Autowired
	private UserDetailsRepo repo;

//public UserDetailsServiceImpl() {
//	repo = new UserDetailsRepoImpl();
//}
	@Override
	public User getUserDetails(LoginBean login) {
		
		
		return repo.getUserDetails(login);
	}

	@Override
	public Loan getLoanDetails(LoginBean login) {
		
		return repo.getLoanDetails(login);
	}

	@Override
	public boolean applyPreclosure(LoginBean login) {
		
		return repo.applyPreclosure(login);
	}

}
