package MethodReference;

import java.time.LocalDate;

public class Stuff {
    public static void stuff(){
        System.out.println("this is doing task");
        System.out.println("this is second task");
        System.out.println(LocalDate.now());
    }
    public static void ThreadTask()  {
        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public  void PrintNumber()  {
        for(int i=0;i<20;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
