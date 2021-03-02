package collection;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//
//        list.remove(3);
//        list.clear();

//
//        Iterator iterator = list.iterator();
//
//        for(iterator = list.iterator();iterator.hasNext();){
//            System.out.println(iterator.hasNext());
//        }
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        list.forEach((s)->{
//            System.out.println(s);
//        });

        ListIterator listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }


        List<Integer> link = new LinkedList<>();

        link.add(1);
        link.add(1);
        link.add(1);
        link.add(1);
        link.add(1);

        List<Integer> list1 = Arrays.asList(23,13,3,3);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(2,4,4,4));

        List<Integer> list3 = new ArrayList<>(List.of(1,2,3,4));

        List<Integer> list4 =
                new ArrayList<>(){{
                    add(1);
                    add(1);
                    add(1);
                    add(1);
        }};
    }


}
