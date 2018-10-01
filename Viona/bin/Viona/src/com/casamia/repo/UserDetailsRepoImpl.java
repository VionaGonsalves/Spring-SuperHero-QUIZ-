package com.casamia.repo;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.casamia.bean.LoginBean;
import com.casamia.entity.Loan;
import com.casamia.entity.User;


@Repository
public class UserDetailsRepoImpl implements UserDetailsRepo{
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public User getUserDetails(LoginBean login) {	
		Session session = sessionFactory.getCurrentSession();
		User user = (User) session.get(User.class, login.getEmail());
		return user;
		
	}
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public Loan getLoanDetails(LoginBean login) {
		Session session = sessionFactory.getCurrentSession();
		Loan loan = (Loan) session.get(Loan.class, login.getEmail());
		return loan;
	}
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public boolean applyPreclosure(LoginBean login) {
		Session session = sessionFactory.getCurrentSession();
		Loan preclosure = (Loan) session.get(Loan.class, login.getEmail());
		
		if(preclosure.getPreClosureStatus()=="null") {
		 preclosure.setPreClosureStatus("Requested");
		return true;
		}
		else
		return false;
	}

	/*@Override
	public String applyPreclosure(LoginBean login) {	
	Session session = factory.getCurrentSession();
	Loan preclosure = (Loan) session.get(Loan.class, login.getEmail());
	if (preclosure.getPreClosureStatus()!=null);
	preclosure.setPreClosureStatus("Applied");
	return preclosure.getPreClosureStatus();
	}*/

	

	
	


	
}
