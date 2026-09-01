package exception;

class agexept extends RuntimeException{// checked exception
    agexept(String str)
    {
        super(str);
    }
}
public class uncheck{
    static void display(int age)
    {
        if(age<18)
        {
            throw new agexept( "not valid age for voting");
        }
        System.out.println("have right to vote");

    }

    public static void main(String[] args) {
//        try{
            display(16);
//        }
//        catch(agexept e)
//        {
//            System.out.println(e);
//            System.out.println(e.getMessage());
//        }
    }
}
