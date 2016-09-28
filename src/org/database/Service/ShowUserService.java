package org.database.Service;

import java.util.List;

import org.database.Beam.Product;
import org.database.Beam.User;

public interface ShowUserService {
	List<User> showUserbyProduct(Product product);
}
