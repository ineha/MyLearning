package DesignPattern;

public class FactoryDesign {
    public static void main(String[] args) {
        Employee android = EmployeeFactory.getEmployee("Android");
        android.getSalary();
    }
}

//focues on creating object for creating object of interfaces.
//loose coupling