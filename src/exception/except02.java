

package exception;
public class except02 {

    public static void main(String [] a)
    {
        int age=18;
        if (age< 18)
        {
            throw new ArithmeticException("not valid age for voting ");
        }
        System.out.println("have right to vote");
    }}