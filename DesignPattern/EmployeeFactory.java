package DesignPattern;

public class EmployeeFactory {
    public static Employee getEmployee(String type){
        if(type.equals("Android")){
            return new AnndroidDeveloper();
        } else if(type.equals("Web")){
            return new WebDeveloper();
        }
        return null;
    }
}
