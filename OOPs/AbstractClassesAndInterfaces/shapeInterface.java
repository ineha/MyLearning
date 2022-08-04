package OOPs.AbstractClassesAndInterfaces;

public interface shapeInterface {

    //by default public static final a jata h
    public static final int i =34;

    //automatically normal method public abstract ho jata h
    void calculateArea(int r);
}

class Circle implements shapeInterface{

    @Override
    public void calculateArea(int r){
        System.out.println("Area of Circle "+r*r);
    }

    public static void main(String[] args) {
        shapeInterface s = new Circle();
        s.calculateArea(2);
    }
}