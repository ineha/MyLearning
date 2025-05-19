package DesignPattern;

public class Jalebi {

    //eager way to initialization
    public static Jalebi jalebi = new Jalebi();
    private Jalebi() {}
    public static Jalebi getJalebi() {
        return jalebi;
    }

}
