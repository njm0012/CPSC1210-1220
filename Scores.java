/**
 * Program using Arrays
 * 
 * Activity 3
 * @author Nick Mitchell - CPSC 1220
 * @version 11/02/23
 */
public class Scores {
    private int[] numbers;

    /**
     * Constructor.
     * @param numbersIn for number input.
     */
    public Scores(int[] numbersIn) {
        numbers = numbersIn;
        
    }

    /**
     * Method.
     * @return returns even numbers in an Array
     */
    public int[] findEvens() {

        int numberEvens = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
            numberEvens++;
            }
        }
        int[] evens = new int[numberEvens];

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evens[count] = numbers[i];
                count++;
            }
        }
        return evens;
    }

    /**
     * Method.
     * @return returns odd numbers in an Array
     */
    public int[] findOdds() {
        int numberOdds = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
            numberOdds++;
            }
        }
        int[] odds = new int[numberOdds];

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                odds[count] = numbers[i];
                count++;
            }
        }
        return odds;
    }

    /**
     * Method.
     * @return returns the average of numbers inside an Array.
     */
    public double calculateAverage() {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }

    /**
     * Method.
     * @return return String of Array elements
     */
    public String toString() {

        String result = "";
        
        for (int i = 0; i < numbers.length; i++) {

            result += numbers[i] + "\t";
        }
        return result;
    }

    /**
     * Method.
     * @return return String of Array elements in reverse
     */
    public String toStringInReverse() {
        
        String result = "";
        
        for (int i = numbers.length - 1; i >= 0; i--) {
            result += numbers[i] + "\t";
        }
        return result;
    }

    }

