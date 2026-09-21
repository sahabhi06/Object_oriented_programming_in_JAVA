//Scenario: A university result system accepts marks for a student. Marks must be between 0
//and 100.
//        (a) Create a class Student with name and marks. [2]
//        (b) Create a method setMarks(int marks) that throws an exception when marks are less
//than 0 or greater than 100. [3]
//        (c) Use try-catch to handle the invalid marks entered by the user. [2]
//        (d) Use a finally block to display "Result processing completed." [3
package exception;
class insufficientbalance extends Exception{
    insufficientbalance(String str)
    {
        super(str);
    }
}

public class Bank {
    int acc;
    double bal;
    Bank(int acc, double bal)
    {
        this.acc=acc;
        this.bal=bal;
    }
    public void withdraw(double amt)throws insufficientbalance{
        if(amt>bal)
         throw new insufficientbalance("Insufficient balance");
        bal-=amt;
        System.out.println("Withdraw successful  __ current bal: "+bal);
    }

    public static void main(String[] args) {
        Bank obj=new Bank(234,3423);
        try {
            obj.withdraw(2311);
        }
        catch (insufficientbalance e)
        {
            System.out.println(e.getMessage());
        }
    }
}
