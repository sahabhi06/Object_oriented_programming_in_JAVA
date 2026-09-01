package exception;

 class ageexept extends Exception{// checked exception
     ageexept(String str)
     {
         super(str);
     }
}


public class userexcept{
    static void display(int age)throws ageexept
    {
        if(age<18)
        {
            throw new ageexept( "not valid age for voting");
        }
        System.out.println("have right to vote");

    }

    public static void main(String[] args) {
        try{
            display(16);
        }
        catch(ageexept e)
        {
            System.out.println("not eligible for voting");
        }
    }
}
