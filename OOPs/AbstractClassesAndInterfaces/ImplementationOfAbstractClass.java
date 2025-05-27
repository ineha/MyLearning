package OOPs.AbstractClassesAndInterfaces;

public class ImplementationOfAbstractClass extends AbstractClass {

    @Override
    public void rocket() {
        System.out.println("Definition of abstract method");
    }
}
    class start{
        public static void main(String[] args) {
            AbstractClass myClass = new ImplementationOfAbstractClass();
            myClass.rocket();
            myClass.cal();
        }
    }

