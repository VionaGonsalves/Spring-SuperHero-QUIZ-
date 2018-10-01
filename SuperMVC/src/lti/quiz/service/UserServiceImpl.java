package lti.quiz.service;

import java.util.Base64;
import java.util.Base64.Encoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lti.quiz.bean.ForgetBean;
import lti.quiz.bean.LoginBean;
import lti.quiz.entity.User;
import lti.quiz.repo.UserRepo;
import lti.quiz.repo.UserRepoImpl;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo repo;

	public UserServiceImpl() {
		repo = new UserRepoImpl();
	}

	@Override
	public User authenticate(LoginBean login) {
		Encoder encoder = Base64.getEncoder();
		String encodePass = encoder.encodeToString(login.getPassword().getBytes());
		login.setPassword(encodePass);

		return repo.authenticate(login);
	}

	@Override
	public boolean register(User register) {
		Encoder encoder = Base64.getEncoder();
		String encodePass = encoder.encodeToString(register.getPassword().getBytes());
		String encodeAns = encoder.encodeToString(register.getAnswer().getBytes());
		register.setAnswer(encodeAns);
		register.setPassword(encodePass);
		return repo.register(register);
	}

	@Override
	public boolean validate(ForgetBean forget) {
		Encoder encoder = Base64.getEncoder();
		String encodeAns = encoder.encodeToString(forget.getAnswer().getBytes());
		forget.setAnswer(encodeAns);
		return repo.validate(forget);

	}

	@Override
	public boolean update(LoginBean change) {
		Encoder encoder = Base64.getEncoder();
		String encodePass = encoder.encodeToString(change.getPassword().getBytes());
		change.setPassword(encodePass);
		return repo.update(change);
	}

}
