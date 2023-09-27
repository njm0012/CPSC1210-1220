import java.text.DecimalFormat;
/**
 * Program that is utilized by the driver program.
 * Project 4
 * @author Nick Mitchell - CPSC 1210
 * @version 09/14/2023
 */
public class Ellipsoid {

    // instance variables

    private String label = "";
    private double a = 0.0;
    private double b = 0.0;
    private double c = 0.0;

    // constructors

    /**
     * Constructor
     * @param labelIn that inputs label name
     * @param aIn for a input
     * @param bIn for b input
     * @param cIn for c input
     */
    public Ellipsoid (String labelIn, double aIn, double bIn, double cIn) {
        setLabel(labelIn);
        setA(aIn);
        setB(bIn);
        setC(cIn);

    }

    // methods

    /**
     * Method
     * @return label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Method.
     * @param labelIn
     * @return true if not equal to null, otherwise false
     */
    public boolean setLabel(String labelIn) {
        if (labelIn != null) {
            label = labelIn.trim();
            return true;
        }
        else {
            return false;
        }

    }

    /**
     * Method.
     * @return a input
     */
    public double getA() {
        return a;
    }

    /**
     * Method.
     * @param aIn that inputs for a
     * @return  true if a value greater than 0
     */
    public boolean setA(double aIn) {
        if (aIn > 0) {
            a = aIn;
            return true;
        }
        else {
            return false;
        }

    }

   /**
    * Methods.
    * @return b input
    */ 
   public double getB() {
        return b;
    }
 
    /**
     * Methods.
     * @param bIn for user input
     * @return true if b value greater than 0
     */ 
    public boolean setB(double bIn) {
        if (bIn > 0) {
            b = bIn;
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Method.
     * @return c input
     */ 
    public double getC() {
        return c;
    }
    
    /**
     * Method.
     * @param cIn for user input
     * @return true if c value greater than 0
     */ 
    public boolean setC(double cIn) {
        if (cIn > 0) {
            c = cIn;
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Method.
     * @return volume input
     */ 
    public double volume() {
        double volume = ((4 * Math.PI * a * b * c) / 3);
        return volume;
    }
    
    /**
     * Method.
     * @return surface area input
     */ 
    public double surfaceArea() {
        double sa = (Math.pow((a * b), 1.6)
        + Math.pow((a * c), 1.6)
        + Math.pow((b * c), 1.6)) / 3;
        sa = 4 * Math.PI * Math.pow(sa, (1.0 / 1.6));
        return sa;
    }
    
    /**
     * Method.
     * @return ellipsoid and userinput info
     */ 
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.0###");
        return "Ellipsoid \"" + label + "\" " + "with axes a = "
        + a + ", b = " + b + ", c = " + c + " units has: "
        + "\n\tvolume = " + df.format(volume()) + " cubic units"
        + "\n\tsurface area = " + df.format(surfaceArea()) + " square units";
    }
    }

    
