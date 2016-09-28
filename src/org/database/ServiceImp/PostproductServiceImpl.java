package org.database.ServiceImp;

import org.database.Beam.Product;
import org.database.Beam.User;
import org.database.Dao.ProductDao;
import org.database.DaoImp.ProductDaoImpl;
import org.database.Service.PostProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostproductServiceImpl implements PostProductService {

	public void postProduct(Product product, User user) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductDao dao=ctx.getBean("productJdbcDaoImpl", ProductDaoImpl.class);
			product.setSalespersons_id(user.getId());
			product.setStore_id(user.getStore_id());
			dao.InsertProduct(product);
	}

}
