package threads;

class Paythread extends Thread{
    public void run(){
        System.out.println("processing customer payment..");
    }
}
class Reportthread extends Thread{
    public void run(){
        System.out.println("Generating account report..");
    }
}
public class prioritythread {
    public static void main(String[] args) {
        Paythread p1=new Paythread();
        Reportthread r1=new Reportthread();
        p1.setPriority(Thread.MIN_PRIORITY);
        r1.setPriority(Thread.MAX_PRIORITY);
        p1.getPriority();
        r1.getPriority();
        p1.setName("Payment thead");
        r1.setName("Report");
        System.out.println(p1.getName());
        System.out.println(r1.getName());
        p1.start();
        r1.start();
    }
}
