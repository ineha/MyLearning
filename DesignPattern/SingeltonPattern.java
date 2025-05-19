package DesignPattern;

public class SingeltonPattern {
    public static void main(String[] args) {
        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
    }
}

//only one object is created
//suppose we are using DB for crud operation and we have to make connection only for the one time.
//constructor should be private os that it could not create any object
//there is one problem if two threads are creating same object at sam etime then it will create two objects
//so for this we can use synchronized keyword
