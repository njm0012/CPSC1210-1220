/**
 * Program that find the results of a specified expression.
 * 
 * Project_02
 * @author Nick Mitchell - CPSC 1210 - A01
 * @version 08/30/2023
 */
public class Expression {
    /**
     * prints out the values assign and determines if expression can be solved.
     * @param args Command line arguments - not used 
     */
    public static void main(String[] args) {
        double x = 1.5, y = 3.1;
        double result;

        System.out.println("result = (10x + 32.6) (5y - 1.567) / xy");
        System.out.println("\tx = " + x);
        System.out.println("\ty = " + y);

        result = (10*x + 32.6) * (5*y - 1.567) / (x*y);

       if (x*y == 0) {
        System.out.println("result is \"undefined\"");
       }
       else {
        System.out.println("result = " + result);
       }

    }
}
