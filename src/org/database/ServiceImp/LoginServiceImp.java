package org.database.ServiceImp;

import org.database.Beam.User;
import org.database.Dao.UserDao;
import org.database.DaoImp.UserDaoImpl;
import org.database.Service.LoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoginServiceImp implements LoginService {

	public boolean verifyLogin(User user) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao dao=ctx.getBean("userJdbcDaoImpl",UserDaoImpl.class);
		return !dao.Verify(user.getAccount(), user.getPassword()).isEmpty();		
	}

	public User getUser(User user) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao dao=ctx.getBean("userJdbcDaoImpl",UserDaoImpl.class);
		return dao.SearchByAccount(user.getAccount()).get(0);
	}
	
	public User getUserById(int id) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao dao=ctx.getBean("userJdbcDaoImpl",UserDaoImpl.class);
		return dao.SearchById(id).get(0);
	}
}
