package ticket;

public class ticketbook {
    private int seatavailable =2;
    public synchronized void bookticket(String customer)
    {
        if(seatavailable >0)
        {
            System.out.println(customer +"trying to book a ticket");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
            System.out.println("Booking Successful");
            seatavailable--;
        }
        else {
            System.out.println(customer+"seat not available");
        }
    }
}
