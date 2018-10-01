import java.util.Iterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.casamia.bean.LoginBean;
import com.casamia.entity.Loan;
import com.casamia.entity.User;
import com.casamia.repo.UserDetailsRepo;
import com.casamia.service.UserDetailsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestClass {
@Autowired
private UserDetailsService service;

@Test
public void testUser() {
	User user = new User();
	LoginBean login = new LoginBean();
	login.setEmail("abc@gmail.com");
    login.setPassword("dc");
   user = service.getUserDetails(login);
	System.out.println(login.getEmail()+""+user.getEmploymentStatus()+" "+user.getAnswer());
}
@Test
public void testLoan() {
	Loan loan = new Loan();
	LoginBean login = new LoginBean();
	login.setEmail("abc@gmail.com");
    login.setPassword("dc");
   loan = service.getLoanDetails(login);
	System.out.println(login.getEmail()+" "+loan.getEmiAmount()+" "+loan.getPreClosureStatus());
}

@Test
public void testClosure() {
	Loan loan = new Loan();
	LoginBean login = new LoginBean();
	login.setEmail("abc@gmail.com");
    login.setPassword("dc");
 service.applyPreclosure(login);
	System.out.println(login.getEmail()+" "+loan.getEmiAmount()+" "+loan.getPreClosureStatus());
}
}