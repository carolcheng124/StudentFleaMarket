package org.database.Service;

import java.util.List;

import org.database.Beam.Product;
import org.database.Beam.Store;

public interface ShowStoreService {
	List<Store> showStoresbyId(Store store);
	List<Store> showStoresbyProduct(Product product);
}
