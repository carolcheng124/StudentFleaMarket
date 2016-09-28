package org.database.ServiceImp;

import java.util.List;

import org.database.Beam.Carts;
import org.database.Beam.Product;
import org.database.Beam.User;
import org.database.Dao.CartsDao;
import org.database.Dao.ProductDao;
import org.database.DaoImp.ProductDaoImpl;
import org.database.Service.AddtoCartsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddtoCartsServiceImpl implements AddtoCartsService {

	public void AddItemtoCarts(User user, Product product, int quantity) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		CartsDao dao=ctx.getBean("cartsJdbcDaoImpl", org.database.DaoImp.CartsDaoImpl.class);
		ProductDao dao1=ctx.getBean("productJdbcDaoImpl", ProductDaoImpl.class);
		Carts carts=new Carts();
		product=dao1.SearchById(product.getId()).get(0);
		carts.setCustomer_id(user.getId());
		carts.setProduct_id(product.getId());
		carts.setPrice(product.getPrice());
		carts.setQuantity(quantity);
		dao.InsertItem(carts);
		product.setInventory_amount(product.getInventory_amount()-quantity);
		if (product.getInventory_amount()>=0) {
			dao1.UpdateProduct(product);
		}else {
			System.out.println(product.getName()+" is not enough!");
		}
	}
	
	public void DelectItemfromCarts(User user) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		CartsDao dao=ctx.getBean("cartsJdbcDaoImpl", org.database.DaoImp.CartsDaoImpl.class);
		dao.DelectItembyUser(user.getId());
	}

	public List<Carts> ShowIteminCarts(User user) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		CartsDao dao=ctx.getBean("cartsJdbcDaoImpl", org.database.DaoImp.CartsDaoImpl.class);
		return dao.showIteminCarts(user.getId());
	}
}
