interface payment
{
    abstract void pay();
    static void pay2()
    {
        System.out.println("Payment successful");
    }
}
class upipay1 implements payment{
    public void pay()
    {
        System.out.println("Upi payment successful");
    }
}
class credit1 implements payment
{
    public void pay()
    {
        System.out.println("Credit card payment successful");
    }

}
public class interfaceExample {
    public static void main(String[] args) {
        upipay1 u=new upipay1();
        credit1 c=new credit1();
        u.pay();
        c.pay();

    }
}
