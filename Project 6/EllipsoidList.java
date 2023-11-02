import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
/**
 * Represents a list of Ellipsoids
 * 
 * @author Nick Mitchell - CPSC 1210
 * @version 09/29/2023
 */
public class EllipsoidList {


    private String listName;
    private ArrayList<Ellipsoid> eList;

    /**
     * Constructor.
     * @param listNameIn
     * @param eListIn
     */
    public EllipsoidList(String listNameIn, ArrayList<Ellipsoid> eListIn) {
        listName = listNameIn;
        eList = eListIn;
    }

    /**
     * Method.
     * @return name of list
     */
    public String getName() {
        return listName;
    }

    /**
     * Method.
     * @return number of Ellipsoids
     */
    public int numberOfEllipsoids() {
        return eList.size();
    }

    /**
     * Method.
     * @return the total volume of all Ellipsoids
     */
    public double totalVolume() {
        double total = 0;
        int index = 0;
        Ellipsoid volEllipsoid;
        if(eList.size() == 0) {
            total = 0;
        }
        else {
            while (index < eList.size()) {
               volEllipsoid = eList.get(index);
               total += volEllipsoid.volume();
               index++;
            }
        }
        return total;

    }

    /**
     * Method.
     * @return the total surface area 
     */
    public double totalSurfaceArea() {
   
        int index = 0;
        Ellipsoid totalSA;
        double totalArea = 0;
        if (eList.size() == 0) {
           totalArea = 0;
        }
        else {
           while (index < eList.size()) {
              totalSA = eList.get(index);
              totalArea += totalSA.surfaceArea();
              index++;
           }
        
        }
        return totalArea;
    }

    /**
     * Method.
     * @return the average volume of the Ellipsoids
     */
    public double averageVolume() {
        int index = 0;
        Ellipsoid volumeEllipsoid;
        double total = 0;
        double totalEllipsoid = eList.size();
        if (eList.size() == 0) {
           total = 0;
        }
        
        else {
           while (index < eList.size()) {
              volumeEllipsoid = eList.get(index);
              total += volumeEllipsoid.volume();
              index++;
           }
        
        }
        if (eList.size() == 0) {
           return total;
        }
        else {
           return (total / totalEllipsoid);
        }
     
    }

    /**
     * Method.
     * @return the average surface area
     */
    public double averageSurfaceArea() {
      int index = 0;
      Ellipsoid totalSA;
      double totalArea = 0;
      double totalE = eList.size();
      if (eList.size() == 0) {
         totalArea = 0;
      }
      else {
         while (index < eList.size()) {
            totalSA = eList.get(index);
            totalArea += totalSA.surfaceArea();
            index++;
         }
      
      }
      if (eList.size() == 0) {
         return totalArea;
      }
      else {
         return (totalArea / totalE);
      }
    }

    /**
     * Method
     * @return the object names in list
     */
    public String toString() {
   
        int index = 0;
        Ellipsoid ellipsoidIndex;
        String call = listName + "\n";
        while (index < eList.size()) {
           ellipsoidIndex = eList.get(index);
           call += "\n" + ellipsoidIndex.toString() + "\n";
           index++;
        }

        return call;
    }

    /**
     * Method
     * @return the summary 
     */
    public String summaryInfo() {
   
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output = "----- Summary for " + listName + " -----";
      output += "\nNumber of Ellipsoid Objects: " + numberOfEllipsoids();
      output += "\nTotal Volume: " + df.format(totalVolume()) + " cubic units";
      output += "\nTotal Surface Area: " + df.format(totalSurfaceArea())
         + " square units";
      output += "\nAverage Volume: " + df.format(averageVolume())
         + " cubic units";
      output += "\nAverage Surface Area: " + df.format(averageSurfaceArea()) 
         + " square units\n";
   
      return output;

    }

    /**
     * Method.
     * @return objects in the list.
     */
    public ArrayList<Ellipsoid> getList() {
      return eList;
    }

    /**
     * Method.
     * @param fileIn for file name input.
     * @return objects from file in a list.
     * @throws FileNotFoundException
     */
    public EllipsoidList readFile(String fileIn) 
      throws FileNotFoundException {
    
   
      ArrayList<Ellipsoid> scanList = new ArrayList<Ellipsoid>();
      String eListName = "";

      Scanner scanFile = new Scanner(new File(fileIn));
    
      listName = scanFile.nextLine();
    
      while (scanFile.hasNext()) {
         eListName = scanFile.nextLine();
         double a = Double.parseDouble(scanFile.nextLine());
         double b = Double.parseDouble(scanFile.nextLine());
         double c = Double.parseDouble(scanFile.nextLine());

         Ellipsoid e = new Ellipsoid(eListName, a, b, c);
         scanList.add(e);
      
      }
      EllipsoidList lastE = new EllipsoidList(listName, scanList);
      return lastE;
      }

      /**
       * Method.
       * @param labelIn for label input
       * @param aIn for a input.
       * @param bIn for b input.
       * @param cIn for c input.
       */
      public void addEllipsoid(String labelIn, double aIn,double bIn, double cIn) {

      Ellipsoid newObj = new Ellipsoid(labelIn, aIn, bIn, cIn);
      eList.add(newObj);
   }

    /**
     * Method.
     * @param labelIn for label input.
     * @return
     */
    public Ellipsoid findEllipsoid(String labelIn) {
      Ellipsoid result = null;
      for (int i = 0; i < eList.size(); i++) {
         if (eList.get(i).getLabel().equalsIgnoreCase(labelIn)) {
            result = eList.get(i);
            break;
         }
      }
      return result;
    }

    /**
     * Method.
     * @param labelIn for label input.
     * @return
     */
    public Ellipsoid deleteEllipsoid(String labelIn) {
      Ellipsoid result = findEllipsoid(labelIn);
      if (result != null) {
         eList.remove(result);
      }
      return result;
    }

    /**
     * Method.
     * @param lIn for label input.
     * @param aaIn for new a input.
     * @param bbIn for new b input.
     * @param ccIn for new c input.
     * @return
     */
    public Ellipsoid editEllipsoid (String lIn, double aaIn, double bbIn, double ccIn) {
      Ellipsoid e = findEllipsoid(lIn);
      if (e != null) {
         e.setA(aaIn);
         e.setB(bbIn);
         e.setC(ccIn);

      }
      return e;
    }


}


