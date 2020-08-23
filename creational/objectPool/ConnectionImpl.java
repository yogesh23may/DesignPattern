package objectPool;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionImpl {
		
	public Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo","root","root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
