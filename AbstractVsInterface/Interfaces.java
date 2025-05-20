package AbstractVsInterface;

public class Interfaces {
    public static void main(String[] args) {
        ParentInterface parentInterface = new SonInterface();
        parentInterface.getCareer();
        parentInterface.sayHello();
        ParentInterface.sayHello2();
        System.out.println(ParentInterface.a);
    }
}
