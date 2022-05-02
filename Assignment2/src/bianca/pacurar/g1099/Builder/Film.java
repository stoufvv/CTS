package bianca.pacurar.g1099.Builder;



public class Film {
	
	int id;
	String filmName;
	String paymentMethod;
	float price;
	String company;
	int iso;
	boolean isDeveloped;
	
	private Film(int id, String filmName, String paymentMethod, float price, String company, int iso,
			boolean isDeveloped) {
		super();
		this.id = id;
		this.filmName = filmName;
		this.paymentMethod = paymentMethod;
		this.price = price;
		this.company = company;
		this.iso = iso;
		this.isDeveloped = isDeveloped;
	}
	
	private Film() {
		
	}
	
	public static class FilmBuilder{
		private Film film = null;
		
		public FilmBuilder(String filmName) {
			this.film = new Film();
			this.film.filmName = filmName;
			
		}
		public FilmBuilder addId(int id) {
			this.film.id = id;
			return this;
		}
		public FilmBuilder addPaymentMethod(String paymentMethod) {
			this.film.paymentMethod = paymentMethod;
			return this;
		}
		public FilmBuilder addPrice(float price) {
			this.film.price = price;
			return this;
		}
		public FilmBuilder addCompany(String company) {
			this.film.company = company;
			return this;
		}
		public FilmBuilder addIso(int iso) {
			this.film.iso = iso;
			return this;
		}
		public FilmBuilder addIsDeveloped() {
			this.film.isDeveloped = true;
			return this;
		}
		public Film build() {
			return this.film;
		}
		
	}
	
	
	
	
	
}