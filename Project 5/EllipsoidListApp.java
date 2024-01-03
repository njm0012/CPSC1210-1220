import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Creating an EllipsoidListApp class.
 *
 * @author Nick Mitchell - CPSC 1210
 * @version 09/22/2023
 */
public class EllipsoidListApp {

/**
 * method will prompt the user to enter a file name.
 * @param args command line not used.
 * @throws FileNotFoundException required by Scanner for file.
 */
   public static void main(String[] args) 
      throws FileNotFoundException {
   
      ArrayList<Ellipsoid> listOfEllipsoids = new ArrayList<Ellipsoid>();
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
   
      Scanner scanFile = new Scanner(new File(fileName));
   
      String listName = scanFile.nextLine();
   
      while (scanFile.hasNext()) {
      
         String label = scanFile.nextLine();
         Double a = scanFile.nextDouble();
         Double b = scanFile.nextDouble();
         Double c = scanFile.nextDouble();
      
         Ellipsoid listKeep = new Ellipsoid(label, a, b, c);
         listOfEllipsoids.add(listKeep);
      
      }
      scanFile.close();
   
      EllipsoidList ellipsoidList = new EllipsoidList(listName, listOfEllipsoids);
   
      System.out.println("");
      System.out.println(ellipsoidList.toString());
      System.out.println("");
      System.out.print(ellipsoidList.summaryInfo());
   }

}