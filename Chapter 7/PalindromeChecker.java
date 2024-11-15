import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String content = input.nextLine();
        
        content = content.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
        
        String reversed = new StringBuilder(content).reverse().toString();
        
        if (content.equals(reversed)) {
            System.out.println("The is a palindrome.");
        } else {
            System.out.println("The is not a palindrome.");
        }

    }
}
