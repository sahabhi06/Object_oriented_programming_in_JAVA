package Threadlab;

public class even extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
        }
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}

