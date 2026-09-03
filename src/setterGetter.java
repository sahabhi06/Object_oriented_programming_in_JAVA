public class setterGetter {
    public String name="Abhi";
    private int mark;
    int roll =24;
    void set(int mk) {
        mark = mk;
    }
    void get() {
        System.out.println("marks: "+mark);
    }
}
 class str1 {
    public void main(String args[])
    {
        setterGetter obj=new setterGetter();
        System.out.println("name is:"+obj.name);
        System.out.println("roll is:"+obj.roll);

        obj.set(200);
        obj.get();
    }
}
