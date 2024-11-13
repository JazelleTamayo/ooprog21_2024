import java.util.Scanner;

public class SpoonerismGenerator {

    public static void main(String[] args) {
        
        String[] words = getWord();
        
        run(words[0], words[1]);
    }

    public static String[] getWord() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first word: ");
        String word1 = input.nextLine();  
        
        
        System.out.print("Enter the second word: ");
        String word2 = input.nextLine();  
        
        return new String[] { word1, word2 };
    }

    public static int vowelIndex(String word) {
        
        String vowels = "aeiou";
        
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;  
            }
        }
        return -1;  
    }

    public static void run(String word1, String word2) {
        
        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);
        
        if (vowelIndex1 == -1 || vowelIndex2 == -1 || vowelIndex1 == 0 || vowelIndex2 == 0) {
            System.out.println(word1+ " and " +word2+ " are not good words to spoonerize");
            return;  
        }
           
        String consonant1 = word1.substring(0, vowelIndex1);
        String rest1 = word1.substring(vowelIndex1);
        String consonant2 = word2.substring(0, vowelIndex2);
        String rest2 = word2.substring(vowelIndex2);
        
        String spoonerized1 = consonant2 + rest1;
        String spoonerized2 = consonant1 + rest2;
        
        System.out.println(word1 + " and " + word2+ " spoonerized are " + spoonerized1 + " and " + spoonerized2);
        
    }
}
