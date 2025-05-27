package OOPs.AbstractClassesAndInterfaces;

public abstract class AbstractClass {
    String name;

    public AbstractClass() {
        this.name = "hi";
    }

    //abstract class can have normal method
    public void cal(){
        System.out.println("calculating Results "+name);
    }
    //abstract method
    abstract public void rocket();
}
//abstract class cannot be instantiated