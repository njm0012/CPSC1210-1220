package Activity_4;

/**
 * Program that is used by the driver program.
 * 
 * Activity 4
 * @author Nick Mitchell -CPSC 1210 -A01
 * @version 09/13/2023
 */
public class UserInfo {

    // instance variables
    private String firstName;
    private String lastName;
    private String location;
    private int age;
    private int status;

    // constants
    private static final int OFFLINE = 0;
    private static final int ONLINE = 1;

    // constructors
    public UserInfo(String firstNameIn, String lastNameIn) {
        firstName = firstNameIn;
        lastName = lastNameIn;
        location = "Not Specified";
        age = 0;
        status = OFFLINE;

    }

    // methods
    /**
     * @return String representing the UserInfo object.
     * @param args Command line arguments - not used.
     */
    public String toString() {
        String output = "Name: " + firstName + " "
            + lastName + "\n";
        output += "Location: " + location + "\n";
        output += "Age: " + age + "\n";
        output += "Status: ";
        if (status == OFFLINE) {
            output += "Offline";
        }
        else {
            output += "Online";
        }

        return output;
    }
    /**
     * @param locationIn to replace old location.
     */

    public void setLocation(String locationIn) {
        location = locationIn;
    }

    /**
     * @param ageIn to replace old age.
     * @return false if applied, otherwise true.
     */
    public boolean setAge(int ageIn) {
        boolean isSet = false;
        if(ageIn > 0) {
            age = ageIn;
            isSet = true;
        }
        return isSet;

    }
    /**
     * @return age
     * @param args Command line arguments - not used.
     */
    public int getAge() {
        return age;
    }

    /**
     * @return location
     * @param args Command line arguments - not used.
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * @param args Command line arguments - not used.
     */
    public void logOff() {
        status = OFFLINE;
    }

    /**
     * @param args Command line arguments - not used.
     */
    public void logOn() {
        status = ONLINE;
    }

    
}
