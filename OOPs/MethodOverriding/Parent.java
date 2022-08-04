package OOPs.MethodOverriding;

import java.util.Scanner;

public class Parent {

    public A methodOfParent(){
        System.out.println("I am method of parent");
        return new A();
    }
}

class A{

}
class B extends A{

}

//public > protected > default > private
 class child extends Parent{

    //overriding method
    //Co-varient return type are allowed
    //child class k accessbility km ni kr skte, brabar rkho ya bdha do.
    @Override
     public B methodOfParent(){
        System.out.println("I am method of child");

        return new B();

    }

    //overriding is a process when child class is not satisfied with the method of parent class then child class
    //overrides the method and redeifine the bofy of method.
 }
 class start{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         child c= new child();
         c.methodOfParent();
         Integer i =3;
         m(i);
         System.out.println(i);
     }

     public static void m(Integer i){
         i=i+2;
         System.out.println(i);
     }
 }