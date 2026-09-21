package Hashing;

import java.util.*;

public class arraylist {

    public static void addMarks(List<Integer> marks, int mark) {
        // Write your code
        marks.add(mark);
    }

    public static double calculateAverage(List<Integer> marks) {
        // Write your code
        int n=0;
        double s=0.0;
        for(int i:marks) {
            s+=i;
            n++;
        }
            double avg = s/n;
        return avg;
    }

    public static int findHighest(List<Integer> marks) {
        // Write your code
        int max=0;
        for(int i:marks)
        {
            if(max<i)
                max=i;
        }
        return max;
    }

    public static void displayMarks(List<Integer> marks) {
        // Write your code
        for(int i:marks)
            System.out.println(i);
    }

    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();

        addMarks(marks, 78);
        addMarks(marks, 85);
        addMarks(marks, 92);
        addMarks(marks, 67);
        addMarks(marks, 88);

        displayMarks(marks);

        System.out.println("Average: " + calculateAverage(marks));
        System.out.println("Highest: " + findHighest(marks));
    }
}