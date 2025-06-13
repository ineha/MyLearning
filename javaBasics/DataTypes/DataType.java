package javaBasics.DataTypes;

public class DataType {
    public static void main(String[] args) {
        int a = Integer.MIN_VALUE; // max 2^31 min -2^31
        byte b = Byte.MAX_VALUE; //max is 127 ans min is -128 can't store more than that (8bits)
        short c = Short.MAX_VALUE; //max - 32767 to -32768(16 bits)
        long d = 4433222345666l;

        //-----------------------------------------------------------------------------------------------------
        float f = 4.657555678f;//float can handle 7 significant digits after that it will round off
        System.out.println(f);
        double dob = 4.77863476673864717d; //double can handle upto 15 significant digits
        System.out.println(dob);
        //------------------------------------------------------------------------------------------
        char ch = 'a'; //for every character we have one integer value
        System.out.println((int)Character.MAX_VALUE);
        System.out.println((int)Character.MIN_VALUE);
        //.---------------------------------------------------------------------------------------
        System.out.println("widening conversion");
        double double1 = 123.4567;
        float float1 = (float) double1;
        System.out.println(float1);
        long long1 = (long) double1; //we need to type case explicitly that it will be a long value
        System.out.println(long1);
        int int1 = (int)double1;
        System.out.println(int1);

        //----------------------------------------------------------------------------------------
        System.out.println("String"); //string is a class
        String string1 = new String("String"); //jvm will create new memory in heap memory
        System.out.println(string1);
        String string2 = "String"; //it will be created in string pool memory and it will be shared
        //for int a =0; this will be stored in stack
        String string3 = "String"; //it will refer to same memory of string2
        System.out.println(string2==string3);
        System.out.println(string1==string2); //diff refernece as with new keyword it will created in string pool
        String name = "john";
        name.toUpperCase();
        System.out.println(name); //it will print john as string is immutable we should do somehtig like name = name.toUpper()
        String name2 = name;
        name = name.toUpperCase();
        System.out.println(name);
        System.out.println(name2 == name);//it will print false as we moved reerence of name to other memory
        String s = "babad";
        System.out.println(s.substring(0,2));

    }
}

//int is primitive datatype and Integer is a wrapper class this is why java is not pure oop
//whenever we type a number in java it means by deafualt it is an integer to tell compiler we need to add l
//for long types