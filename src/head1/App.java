package head1;

import java.util.Date;
import java.util.TimeZone;

public class App {
	public static void main(String [] args) {
		Date localTime = new Date(1481030853296l + 3*60*60*1000/2);
		
		System.out.println(localTime.getTime());
		System.out.println(TimeZone.getDefault());
		System.out.println(TimeZone.getDefault().getOffset(1l)/1000/60/60);
		
		Movie movie1 = new Movie("movie1", 1);
		Movie movie2 = new Movie("movie2", 2);
		Movie movie3 = new Movie("movie3", 3);
		Movie movie4 = new Movie("movie4", 4);
		Movie movie5 = new Movie("movie5", 5);
		
		Rental rental1 = new Rental(movie1, 5);
		Rental rental2 = new Rental(movie2, 3);
		Rental rental3 = new Rental(movie3, 4);
		
		Customer customer = new Customer("customer");
		customer.addRental(rental1);
		customer.addRental(rental2);
		
		System.out.println(customer.statement());
	}
}