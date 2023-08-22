import java.util.Scanner;

public class logic {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input BoreSight Data: ");

        double number = Double.valueOf(scanner.nextLine());
        if ((number >= 91.5) || (number <= 88.5)) {
        System.out.println("TEST FAILED");
        }
        else {
            System.out.println("TEST PASSED");
        }
        scanner.close();

    }
}
