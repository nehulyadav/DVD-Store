
public class PersonType {

    // ------------------------------------------------------------------------
    // Variables and Properties ===============================================
    // ------------------------------------------------------------------------
    private String firstName;
    private String lastName;

    // ------------------------------------------------------------------------
    // Constructors ===========================================================
    // ------------------------------------------------------------------------
    public PersonType(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PersonType() {
        super();
        setFirstName(null);
        setLastName(null);
    }

    // ------------------------------------------------------------------------
    // Utility Methods ========================================================
    // ------------------------------------------------------------------------
    public String printFullName() {
        return (firstName + " " + lastName);
    }

    // ------------------------------------------------------------------------
    // Getters and Setters ====================================================
    // ------------------------------------------------------------------------
    public String getFirstName()                        {return firstName;}
    public void setFirstName(String firstName)          {this.firstName = firstName;}

    public String getLastName()                         {return lastName;}
    public void setLastName(String lastName)            {this.lastName = lastName;}

}

