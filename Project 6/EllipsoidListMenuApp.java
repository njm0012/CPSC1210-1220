import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

/**
 * Class that interacts with list data from a file.
 * @author Nick Mitchell - CPSC 1210
 * @version 09/29/23
 */
public class EllipsoidListMenuApp {
    
    /**
     * Method.
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner userInput = new Scanner(System.in);
        String eListName = "";
        String input = "";
        
        ArrayList<Ellipsoid> myList = new ArrayList<Ellipsoid>();
        EllipsoidList myEList = new EllipsoidList(eListName, myList);

        System.out.println("Ellipsoid List System Menu");
        System.out.println("R - Read File and Create Ellipsoid List");
        System.out.println("P - Print Ellipsoid List");
        System.out.println("S - Print Summary");
        System.out.println("A - Add Ellipsoid");
        System.out.println("D - Delete Ellipsoid");
        System.out.println("F - Find Ellipsoid");
        System.out.println("E - Edit Ellipsoid");
        System.out.println("Q - Quit");

        do {
            System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
            input = userInput.nextLine();
            if (input.length() == 0) {
               continue;
            }
            input = input.toUpperCase().trim();
            char readChar = input.charAt(0);
            switch (readChar) {
               case 'R':
                  System.out.print("\tFile Name: ");
                  String fileName = userInput.nextLine();
                  myEList = myEList.readFile(fileName);
                  System.out.println("\tFile read in and Ellipsoid " 
                     + "List created\n");
                  break;
               case 'P':
                  System.out.println(myEList);
                  break;
               case 'S':
                  System.out.println("\n" + myEList.summaryInfo());
                  break;
               case 'A':
                  System.out.print("\tlabel: ");
                  String label = userInput.nextLine();
                  System.out.print("\ta: ");
                  Double sideA = Double.parseDouble(userInput.next());
                  System.out.print("\tb: ");
                  Double sideB = Double.parseDouble(userInput.next());
                  System.out.print("\tc: ");
                  Double sideC = Double.parseDouble(userInput.next());
               
                  myEList.addEllipsoid(label, sideA, sideB, sideC);
                  System.out.println("\t*** Ellipsoid added ***\n");
                  break;
               case 'D' :
                  System.out.print("\tlabel: ");
                  String labelCheck = userInput.nextLine();
               
                  if (myEList.findEllipsoid(labelCheck) == null) {
                     System.out.println("\t\"" + labelCheck + "\" not found\n");
                  }
                  else {
                     String returnValue = myEList.findEllipsoid(labelCheck).getLabel();
                  
                     myEList.deleteEllipsoid(labelCheck);
                     System.out.println("\t\"" + returnValue + "\" deleted\n");
                  }
                  break;
               case 'F' :
                  System.out.print("\tlabel: ");
                  String findLabel = userInput.nextLine().trim();
                  if (myEList.findEllipsoid(findLabel) == null) {
                     System.out.println("\t\"" + findLabel
                        + "\" not found\n");
                        
                     break;
                  }
                  
                  else {
                     System.out.println(myEList.findEllipsoid(findLabel) + "\n");
                     break;
                  }
               
               case 'E' :
                  System.out.print("\tlabel: ");
                  String eLabel = userInput.nextLine();
                  System.out.print("\ta: ");
                  Double eSideA = Double.parseDouble(userInput.nextLine());
                  System.out.print("\tb: ");
                  Double eSideB = Double.parseDouble(userInput.nextLine());
                  System.out.print("\tc: ");
                  Double eSideC = Double.parseDouble(userInput.nextLine());
               
                  if (myEList.findEllipsoid(eLabel) == null) {
                     System.out.println("\t\"" + eLabel + "\" not found\n");
                  }
                  else {
                     myEList.editEllipsoid(eLabel, eSideA, eSideB, eSideC);
                     System.out.println("\t\"" + eLabel.substring(0, 1).toUpperCase() 
                        + eLabel.substring(1) + "\" successfully edited\n");
                  }
                  break;
               case 'Q' :
                  break;
               default:
                  System.out.println("\t*** invalid code ***\n");
                  break;
            }
         
         } while (!input.equalsIgnoreCase("Q"));
        }
    
}
