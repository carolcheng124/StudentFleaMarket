package org.database.ServiceImp;

import java.util.List;

import org.database.Beam.Product;
import org.database.Dao.ProductDao;
import org.database.DaoImp.ProductDaoImpl;
import org.database.Service.ShowProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShowproductServiceImpl implements ShowProductService {

	public List<Product> showAllProducts() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductDao dao=ctx.getBean("productJdbcDaoImpl",ProductDaoImpl.class);
		return dao.SearchAll();
	}

	public List<Product> showByCatagory(Product product) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductDao dao=ctx.getBean("productJdbcDaoImpl",ProductDaoImpl.class);
		return dao.SearchByCatagory(product.getProduct_kind());
	}

	public List<Product> showByName(Product product) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductDao dao=ctx.getBean("productJdbcDaoImpl",ProductDaoImpl.class);
		return dao.SearchByName(product.getName());
	}
	
	public Product showById(int pid) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductDao dao=ctx.getBean("productJdbcDaoImpl",ProductDaoImpl.class);
		return dao.SearchById(pid).get(0);
	}

}
