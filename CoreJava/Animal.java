package CoreJava;

public class Animal {
    String color="blue";
    String shape;
    int x=2;
    int y=5;

    public Animal() {
        System.out.println("Calling constructor of parent class using super() from child class constructor");
    }

    public void eat(){
        System.out.println("animal is eating");
    }
}
