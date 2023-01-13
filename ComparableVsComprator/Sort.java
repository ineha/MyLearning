package ComparableVsComprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        Employee e1= new Employee(1,"neh");
        Employee e2 = new Employee(2,"bik");
        Employee e3 = new Employee(0,"lkj");
        List<Employee> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        Collections.sort(list);
        System.out.println(list.toString());

        //Comprator -> multiple logic

        Student s1 = new Student(1,"ceh");
        Student s2 = new Student(1,"bik");
        Student s3 = new Student(1,"aokj");
        List<Student> comprator = new ArrayList<>();
        comprator.add(s1);
        comprator.add(s2);
        comprator.add(s3);
        Collections.sort(comprator,new IdComprator());
        System.out.println(comprator);

        //using Lambda expression
        Collections.sort(comprator,(o1,o2)-> (o1.getId()- o2.getId()==0?o1.getName().compareTo(o2.getName()):o1.getId()-o2.getId()));
        System.out.println(comprator);


    }
}
