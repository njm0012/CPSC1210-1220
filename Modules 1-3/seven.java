import java.util.Scanner; // command used to import scanner tool
public class seven {
    public static void main (String[] args){
        System.out.println("Give a number:");
        Scanner scanner = new Scanner(System.in); // Reads user import

        int number = Integer.valueOf(scanner.nextLine()); // user input
        if (number >= 1984) { // Conditional
            System.out.println("Orwell");
        }
        scanner.close();
    }
}