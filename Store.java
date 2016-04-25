import java.util.Arrays;

public class Store {

	// ------------------------------------------------------------------------
	// Variables and Properties ===============================================
	// ------------------------------------------------------------------------

	public int storeNumber;
	private LinkedList<DVD> dvds;
	private LinkedList<Customer> customers;

	// ------------------------------------------------------------------------
	// Constructors ===========================================================
	// ------------------------------------------------------------------------

	// Methods

	// DVD - > Customer
	public void rentDVD(Customer c, DVD d) {
		int i = dvds.getPositionOf(d);
		dvds.remove(i);
		c.rentDVD(d);
	}

	// check in
	public void returnDVD(Customer c, DVD d) {
		c.rentDVD(d);
		dvds.add(d);
	}

	// Create a list of all DVDS owned by the store
	public String allDVD() {
		String returnString = "";
		for(int index = 0; index < dvds.getLength(); index++) {
			returnString = returnString + dvds.getEntry(index).getMovieName() + 
					" Number of Copies: " + dvds.getEntry(index).getNumCopies() + "\n";
		}
		return returnString;
	}
	// Prints A list of all DVDS owned by the store
	public LinkedList<DVD> printAllDVD() {
		return dvds;
	}

	// Check whether a particular DVD is in the store.
	public boolean dvdCheck(DVD d) {
		if (dvds.contains(d)) {
			return true;
		}
		return false;
	}

	// Maintain a customer database.
	// Print a list of all of the DVDs rented by each customer.
	public String allRentedDVDToString(Customer c) {
		return Arrays.toString(dvds.toArray());
	}

	// Also need to maintain:
	// A list of all of the DVDs in the store.
	// A list of all of the store’s customers.
	// Lists of the DVDs currently rented by the customers

}
