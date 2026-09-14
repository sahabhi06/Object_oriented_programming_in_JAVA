package List;
import java.util.*;
public class arraylist2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> l=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(sc.nextLine());
        }
        System.out.println(l);
        l.add(0,"Abhi");
        System.out.println(l);
        l.addFirst("Name:");
        System.out.println(l);
        l.addLast("Sir");
        System.out.println(l);
        l.remove(1);
        System.out.println(l);
        l.removeFirst();
        System.out.println(l);
        l.removeLast();
        System.out.println(l);

    }


}
