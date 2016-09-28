package org.database.Dao;

import java.util.List;

import org.database.Beam.Product;

public interface ProductDao {
	public List<Product> SearchAll();
	public List<Product> SearchByCatagory(String product_kind);
	public void InsertProduct(Product product);
	public void UpdateProduct(Product product);
	public List<Product> SearchById(int id);
	public List<Product> SearchByName(String name);
}
