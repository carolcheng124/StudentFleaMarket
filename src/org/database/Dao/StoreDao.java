package org.database.Dao;

import java.util.List;

import org.database.Beam.Store;

public interface StoreDao {
	List<Store> FindStorebyName(String store_name);

	void InsertStore(Store store);

	List<Store> SearchById(int id);
	
	List<Store> SearchByProduct(String product_kind); 
}
