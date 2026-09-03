public class constructor {
    String name;int roll;
    constructor(){
        System.out.println("Default constructor");
    }
    constructor(String nam, int rol){
        name=nam;
        roll=rol;
    }
    void display()
    {
        System.out.println("Name "+name+"\nRoll no."+roll);
    }
    public void main(String args[])
    {
        constructor s1=new constructor();
        constructor s2=new constructor("abhi",21);
        s2.display();
    }
}
