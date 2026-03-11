package review.Collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // List 객체 사용
        List list1 = new ArrayList();
        List<Integer> list11 = new ArrayList();
        list11.add(1);
        list11.add(2);
        list11.add(3);

        for(Integer i:list11){
            System.out.println(i);
        }

        System.out.println();
        List<String> list2 = new LinkedList();
        list2.add("a");
        list2.add("b");
        list2.add("c");

        for(String instance : list2){
            System.out.println(instance);
        }

        System.out.println();
        list2.remove(2);

        // Linked List
        for(String instance : list2){
            System.out.println(instance);
        }

    }
}
