package head1;

public class App {
	public static void main(String [] args) {
		Movie movie1 = new Movie("movie1", 1);
		Movie movie2 = new Movie("movie2", 2);
		Movie movie3 = new Movie("movie3", 1);
		Movie movie4 = new Movie("movie3", 1);
		
		Rental rental1 = new Rental(movie1, 5);
		Rental rental2 = new Rental(movie2, 3);
		Rental rental3 = new Rental(movie3, 4);
		Rental rental4 = new Rental(movie4, 1);
		
		Customer customer = new Customer("customer");
		customer.addRental(rental1);
		customer.addRental(rental2);
		customer.addRental(rental3);
		customer.addRental(rental4);
		
		System.out.println(customer.statement());
	}
}