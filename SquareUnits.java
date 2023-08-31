import java.util.Scanner;

/**
 * Program that calculates the integral number of units
 * in a specified number of square inches.
 * 
 * Project_02
 * @author Nick Mitchell - CPSC 1210 - A01
 * @version 8/30/2023
 */
public class SquareUnits {
    /**
     * Converts square inches to specified area
     * @param Command line arguments - not used
     */

     public static void main(String[] args) {
        int squareIn, acres, yards, feet, inches, leftoverArea, remainingArea;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the area in square inches: ");
        squareIn = userInput.nextInt();

        if (squareIn > 1000000000) {
            System.out.println("Limit of 1,000,000,000 square inches exceeded!");
            
        } else {
            System.out.println("Number of Units: ");

            acres = squareIn / 6272640;
            System.out.println("\tAcres: " + acres);

            leftoverArea = squareIn % 6272640;
            yards = leftoverArea / 1296;
            System.out.println("\tSquare Yards: " + yards);
            
            remainingArea = leftoverArea % 1296;
            feet = remainingArea / 144;
            System.out.println("\tSquare Feet: " + feet);

            inches = remainingArea % 144;
            System.out.println("\tSquare Inches: " + inches);

        }

     }
}
    
