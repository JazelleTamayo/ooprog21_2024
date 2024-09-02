import java.util.Scanner;

public class SammysRentalPrice {
   
   public static void main(String[] args) {
      
      Scanner rent = new Scanner(System.in);
      
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.println("S  Sammy's makes it fun in the sun.  S");
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      
      int numMinute;
      System.out.println("\nEnter the number of minutes rented: ");
      numMinute = rent.nextInt();
      
      int hours = numMinute / 60;
      int addMinutes = numMinute % 60;
      int totPrice = 40 * hours + addMinutes;
      
      System.out.println("\nHours rented: " +hours);
      System.out.println("Minutes rented: " +addMinutes);
      System.out.println("Total Price: $" +totPrice);
      
      }
}   
      
       