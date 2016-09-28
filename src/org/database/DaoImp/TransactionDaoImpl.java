package org.database.DaoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.database.Beam.Transaction;
import org.database.Dao.TransactionDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class TransactionDaoImpl extends JdbcDaoSupport implements TransactionDao{
	private static final class TransactionMapper implements RowMapper<Transaction>{
		public Transaction mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Transaction transaction=new Transaction();
			transaction.setId(resultSet.getInt("id"));
			transaction.setDate(resultSet.getTimestamp("date"));
			transaction.setCustomer_id(resultSet.getInt("customer_id"));
			transaction.setProduct_id(resultSet.getInt("product_id"));
			transaction.setPrice(resultSet.getFloat("price"));
			transaction.setQuantity(resultSet.getInt("quantity"));
			transaction.setStatus(resultSet.getString("status"));
			return transaction;
		}
	}
}
