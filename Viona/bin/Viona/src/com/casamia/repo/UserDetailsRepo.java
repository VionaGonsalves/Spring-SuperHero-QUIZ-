package com.casamia.repo;

import com.casamia.bean.LoginBean;
import com.casamia.entity.Loan;
import com.casamia.entity.User;


public interface UserDetailsRepo {
public User getUserDetails(LoginBean login);
public Loan getLoanDetails(LoginBean login);
boolean applyPreclosure(LoginBean login);
}

