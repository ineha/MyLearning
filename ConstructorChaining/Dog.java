package ConstructorChaining;

class Animal {
    public static int i;
    Animal() {
        System.out.println("Animal constructor 1");
    }

    Animal(int a) {
        this();
        System.out.println("Animal constructor 2");
    }
    public void display(){
        System.out.println("inside animal");
    }
}
class cat extends Animal{
    public cat(){
        System.out.println("inside cat");
    }
}

public class Dog extends Animal{


    Dog() {
        //super(20);

        System.out.println("Dog 1");
    }
    Dog(int a) {
        //this();
        System.out.println("Dog 2");

    }
//    @Override
//    public void display(){
//        System.out.println("inside dog");
//    }

    public static void main(String[] args) {
       Dog d = new Dog(10);
       d.display();
     //  cat c= new cat();

    }
    {
        System.out.println("initiliaZtion block");
    }

    static {
        System.out.println("static block");
    }
}