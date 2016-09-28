package org.database.Service;

import java.util.List;

import org.database.Beam.Carts;
import org.database.Beam.Product;
import org.database.Beam.User;

public interface AddtoCartsService {
	void AddItemtoCarts(User user, Product product, int quantity);
	void DelectItemfromCarts(User user);
	List<Carts> ShowIteminCarts(User user);
}
