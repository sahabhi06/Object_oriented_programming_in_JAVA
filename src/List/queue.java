package List;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> q=new LinkedList<>();
        q.add("my");
        q.add("name");
        q.add("is");
        q.add("Abhinav");
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.clear();
        System.out.println(q);
//        q.remove();
        q.poll();
        System.out.println(q);
    }
}
