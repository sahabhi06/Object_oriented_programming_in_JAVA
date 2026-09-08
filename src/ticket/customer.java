package ticket;

public class customer extends Thread{
    private ticketbook book;
    private String customername;
    public customer(String name, ticketbook book)
    {
        this.customername=name;
        this.book=book;
    }
    @Override
    public void run(){
        book.bookticket(customername);
    }
}
