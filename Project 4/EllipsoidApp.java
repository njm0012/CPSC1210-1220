import java.util.Scanner;
/**
 * Driver program that reads input and creates an ellipsoid.
 * Project 4
 * @author Nick Mitchell - CPSC 1210
 * @version 09/14/2023
 */
public class EllipsoidApp {

    /**
     * Main method that inputs user data for label
     * and for the three axes.
     * @param args Command line arguments - not used
     */
    public static void main(String[] args) {

        Ellipsoid ellipsoid1 = new Ellipsoid("", 0, 0, 0);

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter label and axes a, b, c for an ellipsoid.");
        System.out.print("\tlabel: ");
        String label = userInput.nextLine();

        System.out.print("\ta: ");
        double a = Double.parseDouble(userInput.nextLine());
        if (a <= 0) {
            System.out.println("Error: axis value must be positive.");
            return;
        }

        System.out.print("\tb: ");
        double b = Double.parseDouble(userInput.nextLine());
        if (b <= 0) {
            System.out.println("Error: axis value must be positive.");
            return;
        }

        System.out.print("\tc: ");
        double c = Double.parseDouble(userInput.nextLine());
        if (c <= 0) {
            System.out.println("Error: axis value must be positive.");
            return;
        }

        ellipsoid1 = new Ellipsoid(label, a, b, c);
        System.out.println("\n" + ellipsoid1);


    }
}
