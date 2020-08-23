package objectPool;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ConnectionPool {

	private static ConnectionImpl connImpl = new ConnectionImpl();
	private static Map<Integer,Connection> availMap = new HashMap<Integer,Connection>();
	private static Integer objCount = 1;

	public Connection acquireConnection(){
		System.out.println("****************************************************");
		Connection connection =null;
		if(objCount<=5){
			System.out.println("acquiring new connection");
			connection = connImpl.getConnection();
			availMap.put(connection.hashCode(),connection);
			objCount = objCount +1;
		}else{
			System.out.println("maximum object limit reached");
			connection = null;
		}
		return connection;
	}

	public void releaseConnection(Connection conn){
		System.out.println("****************************************************");
		if(conn!=null){
			System.out.println("releasing connection ["+conn.hashCode()+"]");
			availMap.remove(conn.hashCode());
			objCount = objCount -1;
			conn = null;
		}else{
			System.out.println("no connection to be released");
		}
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
	}	


	public void showMap(){
		System.out.println("****************************************************");
		Set<Integer> keySet = availMap.keySet();
		System.out.println("map data("+keySet.size()+"):-");
		System.out.println("===========");
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()){
			Integer key = it.next();
			System.out.println(key +" | "+availMap.get(key));
		}
	}
	
}
