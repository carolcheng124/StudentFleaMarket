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
			System.out.println("�ɹ�����Mysql��������");
			conn = DriverManager.getConnection(url);
			Statement stmt = conn.createStatement();
			// int result = stmt.executeUpdate(sql);
			// executeUpdate���᷵��һ����Ӱ����������������-1��û�гɹ�
			ResultSet rs = stmt.executeQuery(sql);
			// executeQuery�᷵�ؽ���ļ��ϣ����򷵻ؿ�ֵ
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
				// ��������ص���int���Ϳ�����getInt()
			}
			
		rs.close();
		stmt.close();
		} catch (SQLException e) {
			System.out.println("MySQL��������");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}

	}
}
