package bianca.pacurar.g1099.Prototype;

public class Film implements Cloneable{
	String company;
	String film;
	
	public Film(String company, String film) {
		this.company = company;
		this.film = film;
	}
	private Film() {
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Film copy = new Film();
		copy.company = company;
		copy.film = film;
		return copy;
	}
	@Override
	public String toString() {
		return "Film [company=" + company + ", film=" + film + "]";
	}
	
	
	
	
}
