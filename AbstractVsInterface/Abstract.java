package AbstractVsInterface;

public class Abstract {
    public static void main(String[] args) {
        Parent p = new Son();
        p.geCareer();
        Parent p2 = new Daughter();
        p2.geCareer();
        Parent.sayHello();
        p2.normalMethod();
      //  Parent p3 = new Parent() can not create object of abstarct class
        //multiple inheritence is not allowed in abstract classes
        //-----------------------------------------------------------------------

    }
}
