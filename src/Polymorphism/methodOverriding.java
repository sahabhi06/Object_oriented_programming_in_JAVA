/* method overriding(dynamic polymorphism or run time polymorphism)
same methods exists in parent and child class with same name,parameters and return type */
package Polymorphism;
class customer3
{
    String name;
    final int phno=2323525;
    String address;

    void show1(String name, int phono)
    {
        System.out.println("name is:" +name);
        System.out.println("name is:" +phono);

    }
    void show2()//method overriden by child class
    {
        System.out.println(" customer from parent class");
    }
}
class regularcust3 extends customer3
{

    void show2()//method overriding parent class show2()
    {
        System.out.println("a regular customer");
    }
}
public class methodOverriding  {
    public static void main(String [] a)
    {
        regularcust3 c1= new regularcust3();
        c1.show1("arun",986754321);
        c1.show2();//calling child class method only
    }
}