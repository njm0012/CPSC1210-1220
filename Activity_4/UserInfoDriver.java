package Activity_4;
/**
 * Driver program that utilizes the class UserInfo.
 * 
 * Activity 4
 * @author Nick Mitchell -CPSC 1210 -A01
 * @version 09/13/2023
 */
public class UserInfoDriver {
/**
 * Methods that create instances and then are printed.
 * @param args Command line arguments - not used.
 */
    
    public static void main(String[] args) {

        UserInfo user1 = new UserInfo("Pat", "Doe");
        System.out.println("\n" + user1);
        user1.setLocation("Auburn");
        user1.setAge(19);
        user1.logOn();
        System.out.println("\n" + user1);

        UserInfo user2 = new UserInfo("Sam", "Jones");
        System.out.println("\n" + user2);
        user2.setLocation("Atlanta");
        user2.setAge(21);
        user2.logOn();
        System.out.println("\n" + user2);
    }
}
