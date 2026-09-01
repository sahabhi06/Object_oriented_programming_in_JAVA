package exception;
//Scenario: A university result system accepts marks for a student. Marks must be between 0
//and 100.
//        (a) Create a class Student with name and marks. [2]
//        (b) Create a method setMarks(int marks) that throws an exception when marks are less
//than 0 or greater than 100. [3]
//        (c) Use try-catch to handle the invalid marks entered by the user. [2]
//        (d) Use a finally block to display "Result processing completed." [3]

class invalidMarks extends Exception{
    invalidMarks(String str){

        super(str);
    }
}
public class student {
    String name;
    int mark;
    student(String name)
    {
        this.name=name;
    }
    static void setmark(int mark)throws invalidMarks{
        if(mark>100 || mark<0)
            throw new invalidMarks("Invalid marks.");
        else
            System.out.println("marks set successsfully");
    }
    public static void main(String[] args) {
        student obj=new student("Abhi");
        try{
            obj.setmark(30);

        }
        catch (invalidMarks e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Result process complete.");
        }
    }
}
