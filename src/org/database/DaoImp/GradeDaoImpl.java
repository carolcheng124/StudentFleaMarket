package org.database.DaoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.database.Beam.Grade;
import org.database.Dao.GradeDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class GradeDaoImpl extends JdbcDaoSupport implements GradeDao {
	private static final class GradeMapper implements RowMapper<Grade>{
		public Grade mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Grade grade=new Grade();
			grade.setId(resultSet.getInt("id"));
			grade.setName(resultSet.getString("name"));
			return grade;
		}
	}
}
