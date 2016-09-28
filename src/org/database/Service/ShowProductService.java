package org.database.Service;

import java.util.List;

import org.database.Beam.Product;

public interface ShowProductService {
	public List<Product> showAllProducts();
	public List<Product> showByCatagory(Product product);
	public List<Product> showByName(Product product);
	
}
