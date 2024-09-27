public class Billing {
   public static void main(String[] args) {
      computeBill(23.2);
      computeBill(24.4, 2);
      computeBill(40.45, 2, 10);
   }
   
   public static void computeBill(double price) {
      double totBill = price + (price * 0.08);
      System.out.println("The total price for the bill is: $" +totBill);
   }
   
   public static void computeBill(double price, int quantity) {
      double total = price * quantity;
      double totBill = total + (total * 0.08);
      System.out.println("The total price for the bill is: $" +totBill);
   }
   
   public static void computeBill(double price, int quantity, int coupDiscount) {
      double total = (price * quantity) - coupDiscount;
      double totBill = total + (total * 0.08);
      System.out.println("The total price for the bill is: $" +totBill);
   }
}

   
      
      