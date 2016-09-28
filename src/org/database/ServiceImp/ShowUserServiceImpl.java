package org.database.ServiceImp;

import java.util.List;

import org.database.Beam.Product;
import org.database.Beam.User;
import org.database.Dao.UserDao;
import org.database.DaoImp.UserDaoImpl;
import org.database.Service.ShowUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShowUserServiceImpl implements ShowUserService {

	
	public List<User> showUserbyProduct(Product product) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao dao=ctx.getBean("userJdbcDaoImpl", UserDaoImpl.class);
		return dao.SearchByProduct(product.getProduct_kind());
	}

}
