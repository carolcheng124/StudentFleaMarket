package org.database.ServiceImp;

import org.database.Beam.Store;
import org.database.Beam.User;
import org.database.Dao.StoreDao;
import org.database.Dao.UserDao;
import org.database.DaoImp.StoreDaoImpl;
import org.database.DaoImp.UserDaoImpl;
import org.database.Service.RegisterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RegisterServiceImpl implements RegisterService {
	
	public boolean registration(User user, Store store) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao dao=ctx.getBean("userJdbcDaoImpl",UserDaoImpl.class);
		StoreDao dao1=ctx.getBean("storeJdbcDaoImpl", StoreDaoImpl.class);
		if (!dao1.FindStorebyName(store.getStore_name()).isEmpty()) {
			if(dao.SearchByAccount(user.getAccount()).isEmpty()){
				user.setStore_id(dao1.FindStorebyName(store.getStore_name()).get(0).getId());
				dao.InsertUser(user);
				return true;
			}else {
				System.out.println("The account has already exist.");
				return false;
			}		
		}else {
			System.out.println("The university doesn't exist");
			return false;
		}
	}
	
}
