package org.database.DaoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.database.Beam.Transation;
import org.database.Dao.TransationDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class TransationDaoImpl extends JdbcDaoSupport implements TransationDao{
	private static final class TransationMapper implements RowMapper<Transation>{
		public Transation mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Transation transation=new Transation();
			transation.setId(resultSet.getInt("id"));
			transation.setDate(resultSet.getTimestamp("date"));
			transation.setCustomer_id(resultSet.getInt("customer_id"));
			transation.setProduct_id(resultSet.getInt("product_id"));
			transation.setPrice(resultSet.getFloat("price"));
			transation.setQuantity(resultSet.getInt("quantity"));
			transation.setStatus(resultSet.getString("status"));
			return transation;
		}
	}
}
