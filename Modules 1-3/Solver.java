import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Program that solves for an expression.
 * 
 * Project_03
 * @author Nick Mitchell - CPSC 1210 - A01
 * @version 09/06/23
 */
public class Solver {
/**
 * Solves expression for x and measures characters on both sides of decimal.
 * @param Command line arguments - not used
 */

    public static void main(String [] args) {

        double x;

        System.out.print("Enter a value for x: ");
        Scanner userInput = new Scanner(System.in);

        x = userInput.nextDouble();

        double result = Math.sqrt(Math.abs((11 * Math.pow(x, 4)) + (9 * Math.pow(x, 3)) + (7 * Math.pow(x, 2)) + (5 * x) + 4)) / ((2 * x) + 4);

        System.out.println("Result: " + result);
        
        String convert = Double.toString(result);
        int left = convert.indexOf('.');
        int right = convert.length() - left - 1;
        
        
        System.out.println("# of characters to the left of the decimal point: " + left);
        System.out.println("# of characters to the right of the decimal point: " + right);

        DecimalFormat df = new DecimalFormat("#,##0.0####");
        System.out.println("Formmatted Result: " + df.format(result));

    }
    
}
