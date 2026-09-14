package List;

import java.util.*;

public class linkedlist {

    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        l.add(12);
        l.add(23);
        l.add(2323);
        l.add(25);
        System.out.println(l);
        l.remove(Integer.valueOf(12));
        System.out.println(l);
        l.set(0,123);
        System.out.println(l);
        if(l.contains(23))
            System.out.println("23 present");
        else
            System.out.println("23 not present");
        for(Integer i:l)
            System.out.println(i);
//        Collections.sort(l);
//        System.out.println(l);
        Collections.sort(l.reversed());
        System.out.println(l);

    }

}