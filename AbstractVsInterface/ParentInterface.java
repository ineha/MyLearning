package AbstractVsInterface;

public interface ParentInterface {
    public static String a = "ParentInterface";
    void getCareer();
    default void sayHello(){
        System.out.println("Hello World");
    }
    static void sayHello2(){
        System.out.println("Hello World from static class");
    }
}

//interfaces can have default methods
