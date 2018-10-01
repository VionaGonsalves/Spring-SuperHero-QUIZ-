package com.casamia.service;

import com.casamia.bean.LoginBean;
import com.casamia.entity.Loan;
import com.casamia.entity.User;

public interface UserDetailsService {
 User getUserDetails(LoginBean login);
 Loan getLoanDetails(LoginBean login);
 
boolean applyPreclosure(LoginBean login);
 

}
