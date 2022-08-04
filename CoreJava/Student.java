package CoreJava;

public class Student {
    int i;
    String name;

    public void details(){
        System.out.println("Id "+i);
        System.out.println("name "+name);
    }
    public void show(){
        System.out.println("this");
        System.out.println(this.name);
    }
}
