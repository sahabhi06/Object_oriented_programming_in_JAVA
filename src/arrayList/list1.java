package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class list1 {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(213);
        list.add(2);
        for(int i:list)
            System.out.println(i);
//        Scanner sc=new Scanner(System.in);
//        int a[]=new int[10];
//        int sum=0;
//        for(int i=0;i<a.length;i++)
//            a[i]=sc.nextInt();
//        for(int i=0;i<a.length;i++)
//        {
//            sum+=a[i];
//        }
    }
}
