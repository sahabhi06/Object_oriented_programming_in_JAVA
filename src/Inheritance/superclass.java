package Inheritance;
class customer2{
    String name;
    int  no;
    String addr;
    customer2(String addr)
    {
        this.addr=addr;
        System.out.println("Address: "+addr);
    }
    void show(String name,int no)
    {
        System.out .println("Name is:"+name+"\nPhone No.:"+no);
    }
    void show1() {
        System.out.println("A regular customer fom parent class");
    }
}
class regcustomer2 extends customer2 {
    regcustomer2(String add){
        super(add);
    }
    void show1() {
        super.show1();
        System.out.println("A regular customer");
    }
}
public class superclass {
    public static void main(String args[]) {
        regcustomer2 a=new regcustomer2("kiet");
        a.show("ABhi",22);
        a.show1();
    }
}
