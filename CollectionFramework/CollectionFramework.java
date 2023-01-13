package CollectionFramework;

import java.util.*;
import java.util.function.Consumer;

public class CollectionFramework {
    public static void main(String[] args) {
        //type safe collection --> same type of elements(objects)
        ArrayList<String> names= new ArrayList<>();
        names.add("hi");
        names.add("ram");
        names.add("sita");
        names.add("rani");
        names.remove("rani");
        names.remove(0);
        Collections.sort(names);
        System.out.println(names);
        System.out.println(names.get(0).length());
        System.out.println(names.size());
        //string object diyanh to string ka equals method krt h
        System.out.println(names.contains("rani"));

        Integer b=new Integer(2);
        Integer c=new Integer(2);
        if(b.equals(c)){
            System.out.println("equals");
        }
        //non type safe ---> different type of elements can be added
//        LinkedList list=new LinkedList<>();
//        list.add("neha");
//        list.add(2);
//        list.add(2.4);
//        System.out.println(list.get(0));


        //order is not preserved here
        HashSet<Integer> set = new HashSet<>();
        set.add(12);
        set.add(23);
        set.add(13);
        set.add(24);
        set.add(90);
        set.add(23);
        System.out.println(set);
        //sort
        System.out.println("Tree SET");

        //for sorted set
        //order is not preserved here
        TreeSet<Integer> set1=new TreeSet<>();
        set1.add(12);
        set1.add(23);
        set1.add(13);
        set1.add(24);
        set1.add(90);
        set1.add(23);
        System.out.println(set1);

        //Traversal -> for each loop
        for(String s:names){
            System.out.println(names);
            StringBuffer str=new StringBuffer(s);
            System.out.println(str.reverse());
        }
    names.forEach(n-> System.out.println(n));
        System.out.println("using Iterator on list");
        //extracting iterator object
        //this one is only for forward traversing
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            //extracting next elemet
            System.out.println(iterator.next());
        }

        System.out.println("using ListIterator on list for reverse traversal");

        //we need to provide the size of list in order to trverse from reverse
        ListIterator<String> listIterator = names.listIterator(names.size());

        while (listIterator.hasPrevious()){

            System.out.println(listIterator.previous());
        }

        System.out.println("using Iterator on set");
        Iterator<Integer> iterator1 = set.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        //this one is for java 8
        names.forEach(System.out::println);


    }
}
