
/*try → Contains the code that may cause an exception.
catch → Handles the exception if it occurs in the try block.
finally → Contains code that always executes, whether an exception occurs or not
Q. An online shopping system takes product quantity and price. It should handle invalid numbers and division errors.  */
import java.util.Scanner;

class except {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter price: ");
            int price = sc.nextInt();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            int total = price / quantity;

            System.out.println("Total: " + total);
        }
        catch (ArithmeticException e) {
            System.out.println("Quantity cannot be zero.");
            System.out.println(e);
        }
        finally {
            System.out.println("Shopping process completed.");
        }
    }
}