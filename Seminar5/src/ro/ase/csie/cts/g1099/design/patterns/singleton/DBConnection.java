package ro.ase.csie.cts.g1099.design.patterns.singleton;

public class DBConnection {

	
	//the reference to the singeton object, unique object
	private static DBConnection connection = null; //refs are null in java
	
	
	//from this point it is a normal class
	private String connectionString;
	private String database;
	private String username;
	
	//all constructors should be private for the singleton, that's the deal...
	private DBConnection(String connectionString, String database, String username) {
		super();
		this.connectionString = connectionString;
		this.database = database;
		this.username = username;
	}

	private DBConnection() {
		super();
	}
	
	public synchronized static DBConnection getConnection() {
		if(connection == null) {
			connection = new DBConnection();
		}
		return connection;
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
