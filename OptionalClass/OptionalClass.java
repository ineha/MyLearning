package OptionalClass;

import java.util.Optional;

//if we want to handle nullpointer exception
public class OptionalClass {
    public static void main(String[] args) {
        String str=null;
        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent());
        //if the value is null then it will return no such value present
       // System.out.println(optional.get());
        System.out.println(optional.orElse("no object in the string"));

        Student s1= new Student(2,"ram");
        Student s2=new Student(3,"neha");
        Student s3=new Student(4,null);

        //.of m agr null value ati h to null pointer exception de dega
        Optional<String> stringOptional = Optional.of(s1.getName());
       if(stringOptional.isPresent())
           System.out.println("name is present"+stringOptional);

       //.ofNullable m agr null value hogi to wo container empty hoga
Optional<String> stringOptional1 = Optional.ofNullable(s3.getName());
stringOptional1.ifPresentOrElse(i-> System.out.println("name is present"+i),()->System.out.println("name is null"));

    }
}

//when to use
//agar hm koi method call kr rhe h aur uska return type optional rhega to caleer function check kr skta h k agr value
//present ho to kam ho ni to na ho
//so hm logo ko null checks ni krne pdenge
