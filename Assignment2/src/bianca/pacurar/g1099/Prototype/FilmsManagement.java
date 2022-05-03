package bianca.pacurar.g1099.Prototype;

import java.util.Date;
import java.util.Random;
import java.util.ArrayList;

public class FilmsManagement implements Cloneable{
	String name;
	Date date;
	ArrayList<Film> films;
	
	public FilmsManagement(String name) {
		this.name = name;
		this.date = new Date();
		films = new ArrayList<>();
		
		//db query takes some time
		try {
            Thread .sleep(3000);
            Random random = new Random();
            for(int i=0; i<20; i++){
                Film film = new Film(getRandomString(random), getRandomString(random));
                this.films.add(film);
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
		
	}
	private FilmsManagement(){}
	@Override
	public Object clone() throws CloneNotSupportedException {
		FilmsManagement copy = new FilmsManagement();
		copy.name = name;
		copy.date = date;
		copy.films = (ArrayList<Film>) this.films.clone();
		return copy;
	}
	//we use this for instantiating easier the film class
	private String getRandomString(Random random){
        String generatedString = random.ints(97, 123)
                .limit(random.nextInt(30))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }
	
}
