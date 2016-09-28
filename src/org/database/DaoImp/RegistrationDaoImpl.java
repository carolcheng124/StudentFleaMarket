package org.database.DaoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.database.Beam.Registration;
import org.database.Dao.RegistrationDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class RegistrationDaoImpl extends JdbcDaoSupport implements RegistrationDao{
	private static final class RegistrationMapper implements RowMapper<Registration>{
		public Registration mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Registration registration=new Registration();
			registration.setId(resultSet.getInt("id"));
			registration.setGrade(resultSet.getString("grade"));
			registration.setSchool(resultSet.getString("school"));
			registration.setSchool_id(resultSet.getInt("school_id"));
			return registration;
		}
	}
}
