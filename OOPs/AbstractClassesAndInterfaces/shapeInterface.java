package OOPs.AbstractClassesAndInterfaces;

public interface shapeInterface {

    //by default public static final a jata h
    public static final int i =34;

    //automatically normal method public abstract ho jata h
    void calculateArea(int r);
    default void sayHello(String s){
        System.out.println("this is hello from "+s);
    }
}

class Circle implements shapeInterface{

    @Override
    public void calculateArea(int r){
        System.out.println("Area of Circle "+r*r);
    }

//    @Override
//    public void sayHello(String s) {
//        System.out.println("this is from "+s);
//    }

    public static void main(String[] args) {
        shapeInterface s = new Circle();
        s.calculateArea(2);
        s.sayHello("child");//if sayhello is not present in child then it will call method of interface
    }
}