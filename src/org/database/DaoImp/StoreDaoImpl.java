package org.database.DaoImp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.database.Beam.Store;
import org.database.Dao.StoreDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class StoreDaoImpl extends JdbcDaoSupport implements StoreDao {
	private static final class StoreMapper implements RowMapper<Store> {
		public Store mapRow(ResultSet resultSet, int rowNum)
				throws SQLException {
			Store store = new Store();
			store.setId(resultSet.getInt("id"));
			store.setStore_name(resultSet.getString("store_name"));
			store.setStreet(resultSet.getString("street"));
			store.setCity(resultSet.getString("city"));
			store.setState(resultSet.getString("state"));
			store.setZip_code(resultSet.getInt("zip_code"));
			store.setNumber_of_salesperson(resultSet
					.getInt("number_of_salesperson"));
			store.setRegion_id(resultSet.getInt("region_id"));
			return store;

		}
	}

	public List<Store> FindStorebyName(String store_name) {
		String sql="SELECT * FROM store WHERE store_name=?";
		return this.getJdbcTemplate().query(sql, new Object[] {store_name}, new StoreMapper());
	}

	public void InsertStore(Store store) {
		String sql="INSERT INTO STORE (store_name, street, city, state, zip_code, manager_id, number_of_salesperon, region_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		this.getJdbcTemplate().query(sql, new Object[] {store.getStore_name(),store.getStreet(),store.getCity(),store.getZip_code(), store.getNumber_of_salesperson(), store.getRegion_id()}, new StoreMapper());
	}

	public List<Store> SearchById(int id) {
		String sql="SELECT * FROM store WHERE id=?";
		return this.getJdbcTemplate().query(sql, new Object[] {id}, new StoreMapper());
	}
	
	public List<Store> SearchByProduct(String product_kind) {
		String sql="select S.* FROM STORE S, product P WHERE P.PRODUCT_KIND=? and S.id=P.store_id";
		return this.getJdbcTemplate().query(sql, new Object [] {product_kind}, new StoreMapper());
	}
}
