package bianca.pacurar.g1099.Facade;

import bianca.pacurar.g1099.Singleton.ConnectionDB;

public class TestAssignment {

	public static void main(String[] args) {
		//singleton
        ConnectionDB DB1 = ConnectionDB.getConnection("localhost://DB");
        ConnectionDB DB2 = ConnectionDB.getConnection("localhost://DB");
        if(DB1 == DB2){
            System.out.println("The database connection is the same");
        }


	}

}
