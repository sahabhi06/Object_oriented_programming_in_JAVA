package Polymorphism;
class customer1{
    String name;
    int  no;
    void show(String name,int no)
    {
        System.out .println("Name is:"+name+"\nPhone No.:"+no);
    }
    void show1() {
        System.out.println("A regular customer fom parent class");
    }
}
class regcustomer1 extends customer1{
    void show1() {
    super.show1();
        System.out.println("A regular customer");
    }
}
public class Overriding {
    public static void main(String args[]) {
        regcustomer1 a=new regcustomer1();
        a.show("ABhi",22);
        a.show1();
    }
}
