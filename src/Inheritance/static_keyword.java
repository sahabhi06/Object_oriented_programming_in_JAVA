package Inheritance;

/*The static keyword means that a member belongs to the class, rather than to individual objects.
Use static when a value or method is common to the whole class.
a.Static Variable
A static variable belongs to the class rather than individual objects.
Only one copy is created and it is shared by all objects.
b.Static Method
A static method belongs to the class and can
be called using the class name without creating an object.
c.Static Block
A static block is used to initialize static variables or perform class-level initialization.
It executes automatically when the class is loaded.
d.Static Nested Class
A static nested class is a class declared inside another class using static. It does not require an object of the outer class to be created.Create a Java program to store student details.
The college name should be common to all students.
question:Create a method to display student details,
initialize the college name using a static block,
and use a static nested class to display a message.
 */
class Student {

    // 1. Static variable
    static String collegeName;
    String name;
    int rollNo;

    // 2. Static block: The static block executes when the class is loaded, before objects are created.
    static {
        collegeName = "KIET";
        System.out.println("College information loaded");
    }

    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // 3. Static method
    static void displayCollege() {
        System.out.println("College: " + collegeName);
    }

    // Non-static method
    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        //System.out.println("College: " + collegeName);
    }

    // 4. Static nested class
    static class CollegeInfo {
        static void message() {
            System.out.println("Welcome to KIET");
        }
    }
}

public class  static_keyword{
    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 101);
        Student s2 = new Student("Priya", 102);

        s1.displayStudent();
        s2.displayStudent();
        // Calling static method using class name
        Student.displayCollege();
        // Calling static nested class
        Student.CollegeInfo.message();
    }
}