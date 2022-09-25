package CoreJava;

import CoreJava.Animal;

public class Dog extends Animal {
   public static String college;
  int x=4;
    //this and super must be the fierst line in constructor
    public Dog() {
        super();
        System.out.println("inside dog");
    }
public void speak(){



    //super is used to refer immediate uper wali class ko refer krte h-----> CoreJava.Animal class
    System.out.println("child class variable using this "+this.x);

    System.out.println("parent class variable using super "+super.x);

    System.out.println("agar child class m wo variable ni h to this parent class ko refer krega " +this.y);

}

}
