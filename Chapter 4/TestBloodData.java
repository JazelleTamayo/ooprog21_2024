import java.util.Scanner;

public class TestBloodData {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      BloodData result = new BloodData();

      System.out.println("Enter Blood Type: ");
      String bloodType = input.next();
      result.setBlood(bloodType);
      
      System.out.println("Enter Rh Factor: ");
      String rhFactor = input.next();
      result.setRh(rhFactor);
      
      result.displayBloodInfo();      
     }
 
   }