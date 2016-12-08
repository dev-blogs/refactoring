package head1;

public class Rental {
	Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	public int getDaysRented() {
		return _daysRented;
	}
	
	public double getCharge() {
		return _movie.getCharge(_daysRented);
	}
	
	public int getFrequentRenterPoints() {
		return _movie._price.getFrequentRenterPoints(_daysRented);
	}
}