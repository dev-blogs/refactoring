package head1;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String _name;
	private Vector _rentals = new Vector();
	
	public Customer(String name) {
		_name = name;
	}
	
	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}
	
	public String getName() {
		return _name;
	}
	
	public String htmlStatement() {
		Enumeration rentals = _rentals.elements();
		String result = "<h1>Rental's operations for <em>" + getName() + "</em></h1><p>\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "<br>\n";
		}
		result += "<p>You credit is <em>" + String.valueOf(getTotalCharge()) + "</em><p>\n";
		result += "You earned <em>" + String.valueOf(getTotalFrequentRenterPoints()) + "</em> bals for active<p>";
		return result;
	}
	
	public String statement() {
		Enumeration rentals = _rentals.elements();
		String result = "Rental for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		result += "Credit is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " bals for active";
		return result;
	}
	
	private double getTotalCharge() {
		double result = 0.0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	
	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
}