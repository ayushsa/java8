package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class one {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(10);
        l.add(20);
        l.add(5);
        l.add(15);
        l.add(25);

        System.out.println(l);

        // Before JDK8
        List<Integer> l2 = new ArrayList<>();
        for (int i : l) {
            if (i % 2 == 0) {
                l2.add(i);
            }
        }
        System.out.println("Before Java 8 -> :" + l2);


        // After JDK8
        List<Integer> l1 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("After Java 8 ->" + l1);

        // After JDK8
        List<Integer> l3 = l.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println(l3);
    }
}
