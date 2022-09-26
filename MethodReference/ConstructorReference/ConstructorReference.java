package MethodReference.ConstructorReference;

public class ConstructorReference {
    public static void main(String[] args) {
        System.out.println("learing ConstructorReference");
        //providing normally by lambda
        Provider provider=()->{
            System.out.println("this is by lambda");
            return new Student();
        };
        Student student = provider.getStudent();
        student.display();

        System.out.println("using ConstructorReference");
        //now by using ConstructorReference
        //className::new
        Provider provider1=Student::new; //new means ConstructorReference
        provider1.getStudent().display();
    }
}
