package head1;

import java.util.Date;
import java.util.TimeZone;

public class App {
	public static void main(String [] args) {
		Movie movie1 = new Movie("movie1", Movie.REGULAR);
		Movie movie2 = new Movie("movie2", Movie.NEW_RELEASE);
		Movie movie3 = new Movie("movie3", Movie.CHILDRENS);
		Movie movie4 = new Movie("movie4", Movie.REGULAR);
		Movie movie5 = new Movie("movie5", Movie.NEW_RELEASE);
		
		Rental rental1 = new Rental(movie1, 5);
		Rental rental2 = new Rental(movie2, 3);
		Rental rental3 = new Rental(movie3, 4);
		
		Customer customer = new Customer("customer");
		customer.addRental(rental1);
		customer.addRental(rental2);
		
		System.out.println(customer.statement());
	}
}