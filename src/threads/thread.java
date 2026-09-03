package threads;
class thread1 extends Thread{
    public void run()
    {
        for (int i=1;i<=3;i++) {
            try{
                Thread.sleep(1000);
            }
                catch(InterruptedException e){
                    System.out.println(e);
            }
            System.out.println("thread1 is running");
        }System.out.println("Exit thread1");
    }
}
class thread2 extends Thread{
    public void run()
    {
        for (int i=1;i<=3;i++)
            System.out.println("thread2 is running");
        System.out.println("Exit thread2");
    }
}
public class thread {
    public static void main(String[] args) {
        thread1 obj=new thread1();
        thread2 obj1=new thread2();
        obj.start();
        obj1.start();
    }
}
