package MethodReference;

import java.util.*;

public class MethodReference {
    public static void main(String[] args) {
        System.out.println("Learing MethodReference");
        //provide the implementation of work interface
        Work work=()->{
            System.out.println("doing task");
        };
        work.doTask();
//refering the previosuly written method
        //yha p method call ni ho rha bs uska reference a rha
        //static ko reference kiy -> ClassName::MethodName
        Work work1= Stuff::stuff; //stuff static method h isliye class name rkh k likha h
        work1.doTask();

        Runnable runnable=Stuff::ThreadTask;
       Thread d= new Thread(runnable);
       d.start();
       Stuff ob = new Stuff();
       //becasue printNumber is non static method hence we need to refer it with object
        //Object::MethodName
       Runnable runnable1=ob::PrintNumber;
       Thread thread=new Thread(runnable1);
       thread.start();
        List<Integer> integers = List.of(1,2,3,4,6,7);
        integers.stream().forEach(System.out::println);

    }
}
