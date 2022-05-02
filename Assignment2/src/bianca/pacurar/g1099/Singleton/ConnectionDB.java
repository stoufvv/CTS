package bianca.pacurar.g1099.Singleton;

public class ConnectionDB {
	private static ConnectionDB connectionDb = null;
	String connectionName;
	
	static { 
		connectionDb = new ConnectionDB();
	}
	public static ConnectionDB getConnection(String connectionName) {
		if(connectionDb == null) {
			connectionDb = new ConnectionDB(connectionName);
		}
		
		return connectionDb;
	}
	private ConnectionDB() {
		
	}
	private ConnectionDB(String connectionString) {
		this.connectionName = connectionName;
	}
}
