import java.util.Scanner;

public class SortingNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        
        System.out.print("Enter 3rd number: ");
        int num3 = input.nextInt();
        
        sortNumber(num1, num2, num3);
        
        }
        
        public static void sortNumber(int num1, int num2, int num3) {
            if (num1 <= num2 && num2 <= num3) {
                  System.out.println("Numbers in ascending order: " + num1 + " " + num2 + " " + num3);
            } else {
                  int large, mid, small;

                  if (num1 >= num2 && num1 >= num3) {
                     large = num1;
                     if (num2 >= num3) {
                        mid = num2;
                        small = num3;
                     } else {
                        mid = num3;
                        small = num2;
                     }
                 } else if (num2 >= num1 && num2 >= num3) {
                     large = num2;
                     if (num1 >= num3) {
                        mid = num1;
                        small = num3;
                     } else {
                        mid = num3;
                        small = num1;
                     }
                } else {
                     large = num3;
                     if (num1 >= num2) {
                        mid = num1;
                        small = num2;
                     } else {
                        mid = num2;
                        small = num1;
                     }
               }
            System.out.println("\nNumbers in ascending order: " +small+ ", " + mid + ", " + large);
            System.out.println("Numbers in descending order: " +large+ ", " + mid + ", " + small);
            
        }

    }
}