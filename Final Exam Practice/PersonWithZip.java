
/**
 * The PersonWithZip class encapsulates a person's name and zip code.
 * 
 */
public class PersonWithZip
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int zipCode;

    /**
     * Constructor for objects of class PersonWithZip
     */
    public PersonWithZip(String firstName, String lastName, int zipCode)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    /**
     * 
     * @return the person's zip code
     */
    public int getZip()
    {
        return zipCode;
    }
    
    
    public String toString()
    {
        return "Name: " + firstName + " " + lastName + "; zip code: " + zipCode;
    }
}
