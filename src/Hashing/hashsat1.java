package Hashing;

//Case Study 10: Set Operations — Challenging
//A university has two sets:
//        •	Students enrolled in Java
//•	Students enrolled in Python
//Write methods to find:
//        1.	Students enrolled in both.
//        2.	Students enrolled in either course.
//3.	Students enrolled only in Java.
//        Driver Code
import java.util.*;

public class hashsat1 {

    public static Set<Integer> commonStudents(Set<Integer> javaStudents, Set<Integer> pythonStudents) {

        // Write your code
        Set<Integer> com=new HashSet<>(javaStudents);
        com.retainAll(pythonStudents);
        return com;
    }

    public static Set<Integer> allStudents(Set<Integer> javaStudents, Set<Integer> pythonStudents) {

        // Write your code
        Set<Integer> t=new HashSet<>(javaStudents);
        t.addAll(pythonStudents);
        return t;
    }

    public static Set<Integer> onlyJava(Set<Integer> javaStudents, Set<Integer> pythonStudents) {

        // Write your code
        Set<Integer> java=new HashSet<>(javaStudents);
        java.removeAll(pythonStudents);
        return java;
    }

    public static void main(String[] args) {

        Set<Integer> javaStudents = new HashSet<>( Arrays.asList(101, 102, 103, 104));

        Set<Integer> pythonStudents = new HashSet<>(Arrays.asList(103, 104, 105, 106));

        System.out.println("Both: " + commonStudents(javaStudents, pythonStudents));

        System.out.println("Either: " + allStudents(javaStudents, pythonStudents));

        System.out.println("Only Java: " + onlyJava(javaStudents, pythonStudents));
    }
}