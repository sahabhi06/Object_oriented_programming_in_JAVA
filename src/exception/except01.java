
package exception;
class except01 {
    public static void main(String[] args) {

        try {
            String quantity = "124";
            int q = Integer.parseInt(quantity);

            int price = 1000;
            int average = price / q;

            System.out.println("Average price: " + average);
        } catch (NumberFormatException e) {
            System.out.println("Invalid quantity entered.");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("Quantity cannot be zero.");
            System.out.println(e);

        } //finally {
        System.out.println("Shopping process completed.");
        //}
    }
}