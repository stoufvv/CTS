package bianca.pacurar.g1099.Facade;

import bianca.pacurar.g1099.Builder.Film;
import bianca.pacurar.g1099.Singleton.ConnectionDB;


public class TestAssignment {

	public static void main(String[] args) {
		
		//Singleton
        ConnectionDB DB1 = ConnectionDB.getConnection("localhost://DB");
        ConnectionDB DB2 = ConnectionDB.getConnection("localhost://DB");
        if(DB1 == DB2){
            System.out.println("The database connection is the same");
        }

        //Builder
        Film film = new Film.FilmBuilder("Gold").addIso(200).addCompany("Kodak").build();

	}

}
