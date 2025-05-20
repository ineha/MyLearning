package AbstractVsInterface;

public class Daughter extends Parent{
    @Override
    void geCareer() {
        System.out.println("Daughter");
    }

    @Override
    void normalMethod() {
        //super.normalMethod();
        System.out.println("daughter normalMethod");
    }
}
