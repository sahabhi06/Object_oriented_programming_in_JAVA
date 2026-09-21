package Hashing;

/*A Set in Java is a collection that stores unique elements. Unlike a List,
a Set does not allow duplicate elements.
| Set             | Maintains order?      | Allows duplicates? | Main feature                 |
| --------------- | --------------------- | ------------------ | ---------------------------- |
| `HashSet`       | ❌ No guaranteed order | ❌ No               | Fast, general-purpose        |
| `LinkedHashSet` | ✅ Insertion order     | ❌ No               | Maintains insertion order    |
| `TreeSet`       | ✅ Sorted order        | ❌ No               | Automatically sorts elements |
*/
import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>();

        s1.add(24);
        s1.add(50);
        s1.add(26);
        s1.add(100);   // Duplicate

        System.out.println(s1);

        LinkedHashSet<Integer> s2 = new LinkedHashSet<>();

        s2.add(24);
        s2.add(50);
        s2.add(26);
        s2.add(100);
        System.out.println(s2);

        TreeSet<Integer> s3 = new TreeSet<>();

        s3.add(24);
        s3.add(50);
        s3.add(26);
        s3.add(100);
        System.out.println(s3);
        s1.add(200);
        System.out.println(s1);
    }}