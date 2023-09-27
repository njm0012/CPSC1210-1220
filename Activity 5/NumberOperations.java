/**
 * Program that creates methods for the NumberOps driver program.
 * 
 * Activity 5
 * @author Nick Mitchell - CPSC 1210 - A01
 * @version 09/20/2023
 */
public class NumberOperations {

    private int number;

    //constructor

    public NumberOperations(int numberIn) {
        numberIn = number;

    }

    // Methods.

    public int getValue() {
        return number;
    }

    public String oddsUnder() {
        String output = "";
        int i = 0;
        while (i < number) {
            if (i % 2 != 0) {
                output += i + "\t";
            }
            i++;
        }
        return output;
    }

    public String powersTwoUnder() {
        String output = "";
        int powers = 1;
        while (powers < number) {
            if (powers % 2 == 0) {
                output += powers + "\t";
                powers = powers * 2;
            }
        }
        return output;
    }

    public int isGreater(int compareNumber) {
        if (number > compareNumber) {
            return 1;
        }
       else if (number < compareNumber) {
            return -1;
        }
         else {
            return 0;
        }
    }

    public String toString() {
        return number + "";
    }

}