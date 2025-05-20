package AbstractVsInterface;

public  abstract class Parent {

    abstract void geCareer();
    static void sayHello() {
        System.out.println("Hello World");
    }
    void normalMethod() {
        System.out.println("Normal");
    }
}
//if there is one or more abstarct method then the class is abstract
//child class must extend it