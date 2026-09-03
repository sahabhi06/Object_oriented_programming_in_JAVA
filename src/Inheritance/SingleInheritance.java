package Inheritance;
class customer{
    String name;
    int  no;
    void show(String name,int no)
    {
        System.out .println("Name is:"+name+"\nPhone No.:"+no);
    }
}
class regcustomer extends customer{
    void show1() {
        System.out.println("A regular customer");
    }
}
public class SingleInheritance {
    public static void main(String args[]) {
        regcustomer a=new regcustomer();
        a.show("ABhi",23432);
        a.show1();
    }
}
