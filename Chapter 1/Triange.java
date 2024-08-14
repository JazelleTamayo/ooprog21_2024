public class Triange {
    public static void main(String[] args) {
        int rows = 7; 
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows + i; j++) {
                if (j >= rows - 1 - i && j <= rows - 1 + i) {
                    System.out.print("T");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
