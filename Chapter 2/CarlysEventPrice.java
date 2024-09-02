import java.util.Scanner;

public class CarlysEventPrice {

   public static void main(String[] args) {
   
      Scanner event = new Scanner(System.in);

      System.out.println("***************************************");
      System.out.println("*  Carly's makes the food that makes  *");
      System.out.println("*             it a party.             *");
      System.out.println("***************************************");
      
      int numGuest;
      System.out.println("\nEnter the number of guests attending the event: ");
      numGuest = event.nextInt();
      
      int pricePerPerson = 35;
      int totPrice = numGuest * pricePerPerson;
      
      System.out.println("\nNumber of guests: " +numGuest);
      System.out.println("Price per guest : $" +pricePerPerson);
      System.out.println("Total price: $" +totPrice);
      System.out.println("Is the job a large event? " +(numGuest >= 50));
       
                 
   }
}