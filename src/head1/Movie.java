package head1;

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private String _title;
	private int _priceCode;
	
	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}

	public String getTitle() {
		return _title;
	}

	public void set_title(String _title) {
		this._title = _title;
	}

	public int getPriceCode() {
		return _priceCode;
	}

	public void setPriceCode(int arg) {
		this._priceCode = arg;
	}

	double getCharge(int daysRented) {
		double result = 0.0;
		switch (getPriceCode()) {
			case Movie.REGULAR :
				result += 2;
				if (daysRented > 2) {
					result += (daysRented - 2) * 1.5;
				}
				break;
			case Movie.NEW_RELEASE :
				result += daysRented * 3;
				break;
			case Movie.CHILDRENS :
				result += 1.5;
				if (daysRented > 3) {
					result += (daysRented - 3) * 1.5;
				}
				break;
		}
		return result;
	}
	
	int getFrequentRenterPoints(int daysRented) {
		if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) {
			return 2;
		} else {
			return 1;
		}
	}
}