package Threadlab;

public class mymain {
    public static void main(String[] args) {
        even e=new even();
        odd e1=new odd();
        e.start();
        e1.start();
    }
}
