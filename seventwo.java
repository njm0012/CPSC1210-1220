import java.util.Scanner;

public class seventwo {
    public static void main(String [] args){
        System.out.println("Give Points [0-100]");
        Scanner scanner = new Scanner (System.in);

        int number = Integer.valueOf(scanner.nextLine());
        if (number <= 49) {
            System.out.println("Failed");
        }
        else if (number < 59) {
            System.out.println("Grade: 1");
        }
        else if (number < 69) {
            System.out.println("Grade: 2");
        }
        else if (number < 79) {
            System.out.println("Grade: 3");
        }
        else if (number < 89) {
            System.out.println("Grade: 4");
        }
        else if (number < 99) {
            System.out.println("Grade: 5");
        }
        else if (number > 100) {
            System.out.println("Incredible!");
        }


    }
}