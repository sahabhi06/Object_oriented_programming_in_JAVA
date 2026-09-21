package Hashing;

//Case Study 5: Attendance System — LinkedHashSet
//A school wants to record the IDs of students who attended an event.
//Requirements:
//        •	A student should be recorded only once.
//•	The order in which students arrived must be preserved.
//Driver Code
import java.util.*;

public class linkeedhash {

    public static void markAttendance(Set<Integer> attendance,
                                      int studentId) {
        attendance.add(studentId);
        // Write your code
    }

    public static boolean isPresent(Set<Integer> attendance,
                                    int studentId) {
        // Write your code
        if(attendance.contains(studentId))
        return true;
        else
            return false;
    }

    public static int getAttendanceCount(Set<Integer> attendance) {
        // Write your code
        int s=attendance.size();
        return s;
    }

    public static void displayAttendance(Set<Integer> attendance) {
        // Write your code
        System.out.println(attendance);
    }

    public static void main(String[] args) {

        Set<Integer> attendance = new LinkedHashSet<>();

        markAttendance(attendance, 105);
        markAttendance(attendance, 102);
        markAttendance(attendance, 108);
        markAttendance(attendance, 105);
        markAttendance(attendance, 101);

        displayAttendance(attendance);

        System.out.println("Student 108 present: "
                + isPresent(attendance, 108));

        System.out.println("Total Present: "
                + getAttendanceCount(attendance));
    }
}