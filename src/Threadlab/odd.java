package Threadlab;

public class odd extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e1){
                System.out.println(e1.getMessage());
            }
            if (i % 2 != 0)
                System.out.println(i);
        }
    }
}