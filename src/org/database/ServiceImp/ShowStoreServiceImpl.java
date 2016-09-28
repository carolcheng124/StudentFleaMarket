package org.database.ServiceImp;

import java.util.List;

import org.database.Beam.Product;
import org.database.Beam.Store;
import org.database.Dao.StoreDao;
import org.database.DaoImp.StoreDaoImpl;
import org.database.Service.ShowStoreService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShowStoreServiceImpl implements ShowStoreService {

	public List<Store> showStoresbyId(Store store) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		StoreDao dao=ctx.getBean("storeJdbcDaoImpl", StoreDaoImpl.class);
		return dao.SearchById(store.getId());
	}

	public List<Store> showStoresbyProduct(Product product) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		StoreDao dao=ctx.getBean("storeJdbcDaoImpl", StoreDaoImpl.class);
		return dao.SearchByProduct(product.getProduct_kind());
	}
}
