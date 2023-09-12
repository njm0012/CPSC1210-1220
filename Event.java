import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
/**
 * Program that.
 * 
 * Project_03
 * @author Nick Mitchell - CPSC 1210 - A01
 * @version 09/08/23
 */
public class Event {
/**
 * Solves expression for x and measures characters on both sides of decimal.
 * @param args Command line arguments - not used
 */
 
   public static void main(String[] args) {
      
      String day, year, date, month, hours, minutes, section;
      String time, row, seat, eventName;
      Double cost, price, discount;
   
      System.out.print("Enter your event code: ");
      Scanner userInput = new Scanner(System.in);
      
      String event = userInput.nextLine().trim();

      if (event.length() < 26) {
         System.out.println("\nInvalid Event Code. \nEvent code must "
            + "have atleast 26 characters.");
      
            return;
      }
      
      day = event.substring(0, 2);
      month = event.substring(2, 4);
      year = event.substring(4, 8);
      date = day + "/" + month + "/" + year;
      
      hours = event.substring(8, 10);
      minutes = event.substring(10, 12);
      time = hours + ":" + minutes;
      
      price = Double.parseDouble(event.substring(12, 17)) / 100.00;
      DecimalFormat pf = new DecimalFormat("$#,##0.00");
      
      discount = Double.parseDouble(event.substring(17, 19)) / 100.00;
      DecimalFormat df = new DecimalFormat("0%");
      
      cost = price - (price * discount);
      DecimalFormat cf = new DecimalFormat("$#,##0.00");
      
      section = event.substring(19, 21);
      row = event.substring(21, 23);
      seat = event.substring(23, 25);
      eventName = event.substring(25, event.length());
      
      Random random = new Random();
      int prize = random.nextInt(9999) + 1; 
      DecimalFormat prizeNum = new DecimalFormat("0000");
      
         System.out.print("\nEvent: " + eventName);
         System.out.print("   Date: " + date);
         System.out.print("   Time: " + time);
         
         System.out.print("\nSection: " + section);
         System.out.print("   Row: " + row);
         System.out.print("   Seat: " + seat);
         
         System.out.print("\nPrice: " + pf.format(price));
         System.out.print("   Discount: " + df.format(discount));
         System.out.print("   Cost: " + cf.format(cost));
         
         System.out.print("\nPrize Number: " + prizeNum.format(prize));
         
         }
   }