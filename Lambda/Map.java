package Lambda;
//the map() is used to transform one object into other by applying a function

import ComparableVsComprator.IdComprator;
import ComparableVsComprator.Student;

import java.util.*;

public class Map {
    public static void main(String[] args) {
        Student s1 = new Student(1,"ceh");
        Student s2 = new Student(2,"bik");
        Student s3 = new Student(4,"aokj");
        List<Student> comprator = new ArrayList<>();
        comprator.add(s1);
        comprator.add(s2);
        comprator.add(s3);
        //filter -> ye predicate leta h means condition lgti h ism
        // map -> transform krta h means hme student k object se id k stream chahiye thi
        // reduce -> terminal operation k liye
        System.out.println(comprator.stream().filter(i->i.getId()%2==0).map(i->i.getId()).reduce(0,(a,b)->a+b));

        //how to sort a map using lambda
        HashMap<String, Integer>map=new HashMap<>();
        map.put("neh",1);
        map.put("bjk",2);
        map.put("nkl",0);
        List<java.util.Map.Entry<String,Integer>>list=new ArrayList<>(map.entrySet());
//        Collections.sort(list, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
//        for(java.util.Map.Entry<String,Integer> entry:list){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
        map.entrySet().stream().sorted(java.util.Map.Entry.comparingByKey()).forEach(System.out::println);
        //how to sort map using custom data type
        HashMap<Student, Integer>customMap=new HashMap<>();
        customMap.put(s1,10);
        customMap.put(s2,20);
        customMap.put(s3,5);
        List<java.util.Map.Entry<Student,Integer>>list1= new ArrayList<>(customMap.entrySet());
        System.out.println("printing list ");
        System.out.println(list1);
        Collections.sort(list1, new Comparator<java.util.Map.Entry<Student, Integer>>() {
            @Override
            public int compare(java.util.Map.Entry<Student, Integer> o1, java.util.Map.Entry<Student, Integer> o2) {
                return o1.getKey().getId()-o2.getKey().getId();
            }
        });
        for(java.util.Map.Entry<Student,Integer> entry:list1){
                        System.out.println(entry.getKey()+" "+entry.getValue());
           }

        //using Lambda expression
        System.out.println("Sort using Lambda expression");
        customMap.entrySet().stream().sorted(java.util.Map.Entry.comparingByKey(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId()-o2.getId();
            }
        })).forEach(System.out::println);
        System.out.println("Sort By Value");
        customMap.entrySet().stream().sorted(java.util.Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
