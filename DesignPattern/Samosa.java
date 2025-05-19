package DesignPattern;

public class Samosa {
    private static Samosa samosa;
    private Samosa() {
        System.out.println("inside Samosa");
    }
    public static Samosa getSamosa() { //lazy initialization
        if(samosa==null) {
            synchronized (Samosa.class){samosa = new Samosa();}
        }
        return samosa;
    }
}
