abstract class pay1 {
    abstract void pay();
    void message() {
        System.out.println("Successful payment");
    }
}
class upipay extends pay1
        {
            void pay()
            {
                System.out.println("P1 payment");
            }
}
class credit extends pay1
{
            void pay()
            {
                System.out.println("credit card payment");
            }

}
public class abs {
    public static void main() {
        upipay s1=new upipay();
        credit s2=new credit();
        s1.pay();
        s2.pay();
        s1.message();
    }
    }
