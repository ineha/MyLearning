package String;

public class StringMutable {
    public static void main(String[] args) {
        //A thread-safe, mutable sequence of characters. A string buffer is like a String, but can be modified.
        StringBuffer sbf=new StringBuffer("Neharika");
        sbf.append(" Dwivedi");
        sbf.replace(0,4,"subbu");
        sbf.delete(0,4);
        System.out.println(sbf);
        StringBuffer sbf1=new StringBuffer("Neharika");
        StringBuffer sbf2=new StringBuffer("Neharika");
        String s = new String("Neharika");
        System.out.println(s);
        s=s+" dwivedi";
        System.out.println(s);

        //false -because it calls equals method of object class and that method checks reference of two objects
        System.out.println(sbf1.equals(sbf2));

        StringBuilder s1 = new StringBuilder("Neha");
        StringBuilder s2 = new StringBuilder("Neha");

        //false-because it calls equals method of object class and that method checks reference of two objects
        System.out.println(s1.equals(s2));

        String s3=new String("Neha");
        String s4= new String("Neha");

        //true because String class overrided equals method of object class.
        System.out.println(s3.equals(s4));

        StringBuffer s5=new StringBuffer("Neha");
        StringBuffer s6= s5;
        //because new s ek bar memory allocate ho gyi h to s6 wala s5 ko pint kregaa
        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));
        String a = "Neha";
        String b = "Neha";
        //a="subhi";
        System.out.println(a==b);
        String k = new String("Neha");
        String l = new String("Neha");
        System.out.println(k==l);
    }

}
