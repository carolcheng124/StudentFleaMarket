import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnection {

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		String sql = null;
		String url = "jdbc:mysql://localhost:3306/e_commerce?"
				+ "user=root&password=&useUnicode=true&characterEncoding=UTF8";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("成功加载Mysql驱动程序");
			conn = DriverManager.getConnection(url);
			Statement stmt = conn.createStatement();
			// int result = stmt.executeUpdate(sql);
			// executeUpdate语句会返回一个受影响的行数，如果返回-1就没有成功
			ResultSet rs = stmt.executeQuery(sql);
			// executeQuery会返回结果的集合，否则返回空值
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
				// 入如果返回的是int类型可以用getInt()
			}
			
		rs.close();
		stmt.close();
		} catch (SQLException e) {
			System.out.println("MySQL操作错误");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}

	}
}
