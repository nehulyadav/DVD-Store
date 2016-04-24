package project;

import java.util.Arrays;

/**
 * Created by zodyac on 4/23/2016.
 */
public class Customer extends PersonType {


    // ------------------------------------------------------------------------
    // Variables and Properties ===============================================
    // ------------------------------------------------------------------------
    private int accountNumber;
    private LinkedList<DVD> dvdList;

    // ------------------------------------------------------------------------
    // Constructors ===========================================================
    // ------------------------------------------------------------------------
    // Minimum required constructor
    public Customer(String firstName, String lastName, int accountNumber) {
        super(firstName, lastName);
        this.accountNumber = accountNumber;
    }
    // Complete Constructor
    public Customer(String firstName, String lastName, int accountNumber, LinkedList<DVD> dvdList) {
        super(firstName, lastName);
        this.accountNumber = accountNumber;
        this.dvdList = dvdList;
    }

    // ------------------------------------------------------------------------
    // DVD Methods ============================================================
    // ------------------------------------------------------------------------
    public void rentDVD(DVD dvd) {
        dvdList.add(dvd);
    }
    public DVD returnDVD(DVD dvd) {
        int position = dvdList.getPositionOf(dvd);
        return dvdList.remove(position);
    }

    // ------------------------------------------------------------------------
    // Utility Methods ========================================================
    // ------------------------------------------------------------------------
    public String dvdListToString() {
        return Arrays.toString(getDvdArray());
    }

    // ------------------------------------------------------------------------
    // Getters and Setters ====================================================
    // ------------------------------------------------------------------------
    public int getAccountNumber()                           {return accountNumber;}
    public void setAccountNumber(int accountNumber)         {this.accountNumber = accountNumber;}

    public DVD[] getDvdArray()                              {return dvdList.toArray();}
}
