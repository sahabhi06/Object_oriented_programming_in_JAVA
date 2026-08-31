
/*  throw is used to manually create and throw an exception.
-Used inside a method/block/constructor
-Used in method declaration
-Throws one exception at a time
Q.check voting eligibility. If the age is below 18, use throw to
generate an exception; otherwise, display that the person is eligible to vote.*/

public class throw_exception {

    public static void main(String [] a)
    {
        int age=18;
        if (age< 18)
        {
            throw new ArithmeticException("not valid age for voting ");
        }
        System.out.println("have right to vote");
    }}