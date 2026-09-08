package ticket;

public class mybooking {
    public static void main(String[] args) {
        ticketbook booking=new ticketbook();
        customer c1=new customer("rahul ",booking);
        customer c2=new customer("payal ",booking);
        customer c3=new customer("aditya ",booking);
        customer c4=new customer("karan ",booking);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
