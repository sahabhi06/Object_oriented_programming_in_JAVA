public class addition {
    int s1,s2;
    void sum(int a,int b){
        System.out.println("Sum:"+a+b);
    }
    void sum(int a,int b,int c){

        System.out.println("Sum:"+a+b+c);
    }
    void sum(){
        System.out.println("Sum:0");
    }
    public void main(String args[])
    {
        addition obj=new addition();
        obj.sum();
        obj.sum(2,34);
        obj.sum(23,43,5);
    }
}

