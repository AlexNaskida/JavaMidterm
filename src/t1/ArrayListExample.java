package t1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Correct generic type
        List<Integer> list1 = new ArrayList<Integer>();
        List<String> list2 = new ArrayList<String>();

        list1.add(7);
        list1.add(9);
        list1.add(8);
        list1.add(1);
        list1.add(10);
        list1.add(3);
        list1.add(6);
        list1.add(4);
        list1.add(5);
        list1.add(2);

        list2.add("uqu");
        list2.add("dcs");
        list2.add("tpo");
        list2.add("scm");
        list2.add("eyy");
        list2.add("tit");
        list2.add("aux");
        list2.add("hez");
        list2.add("xky");
        list2.add("zaf");
        list2.add("oyj");
        list2.add("uwe");

//        System.out.println("Iterating over elements:");
//        for (int number : list1) {
//            System.out.println(number);
//        }

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        List<String> list3 = new ArrayList<>();

        for (int num : list1) {
            list3.add(list2.get(num-1)); // use value from list1 as index for list2
        }

        // Print the result
//        for (String item : list3) {
//            System.out.println(item);
//        }

        System.out.println("list3: " + list3);

    }
}
