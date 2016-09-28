package org.database.DaoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.database.Beam.School;
import org.database.Dao.SchoolDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class SchoolDaoImpl extends JdbcDaoSupport implements SchoolDao {
	private static final class SchoolMapper implements RowMapper<School>{
		public School mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			School school=new School();
			school.setId(resultSet.getInt("id"));
			school.setName(resultSet.getString("name"));
			return school;
		}
	}
}
