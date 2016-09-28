package org.database.Service;

import org.database.Beam.Product;
import org.database.Beam.User;

public interface PostProductService {
	public void postProduct(Product product, User user);
}
