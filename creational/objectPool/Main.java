/*
 * Performance can be sometimes the key issue during the software development and the object creation
 * (class instantiation) is a costly step. While the Prototype pattern helps in improving the performance by 
 * cloning the objects, the Object Pool pattern offer a mechanism to reuse objects that are expensive to create.
 */
package objectPool;

import java.sql.Connection;

public class Main {

	public static void main(String args[]){
		ConnectionPool pool = new ConnectionPool();
		Connection conn1 = pool.acquireConnection();
		Connection conn2 = pool.acquireConnection();
		Connection conn3 = pool.acquireConnection();
		Connection conn4 = pool.acquireConnection();
		Connection conn5 = pool.acquireConnection();
		Connection conn6 = pool.acquireConnection();
		pool.showMap();
		
		pool.releaseConnection(conn1);
		
		conn6 = pool.acquireConnection();
		pool.showMap();
		
	}
}
