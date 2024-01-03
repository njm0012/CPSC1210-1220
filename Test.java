import java.util.Random;
// Program that generates a random name from an array. used to select names for Xmas.

public class Test {

    public static void main(String[] args) {

        Random gen = new Random();
        String[] select = {"NICK", "BRANDON", "DAVID", "MARTIN"};
        int j = 10;

        while (j > 0) {
        int i = gen.nextInt(select.length);
        System.out.println(select[i]);
        j--;
        }

    }
    

}