package exception;

public class throwkey {
    static void display(int age)throws ArithmeticException, NullPointerException
    {
        if(age<18)
        {
            throw new ArithmeticException("not valid age for voting");
        }
        System.out.println("have right to vote");

    }

public static void main(String[] args) {
    try{
        display(15);
    }
    catch(ArithmeticException | NullPointerException e)
    {
        System.out.println("not eligible for voting");
    }
}
}
