package ExceptionalHandling;

public class Throw {
    public static void main(String[] args) {

        int age=16;
        try {
            if(age<17){
                //we use throw for custom made exception
                //but exception handle abhi b ni ho rhi
                //we need to add try catch block arround this
                throw new YoungerAgeException("you are not elligible");
            }
        }
        catch (YoungerAgeException e){
        e.printStackTrace();
    }
        System.out.println("after exception");

    }
//    public static void divide(){
//        try {
//            int b = 10;
//            int c = 0;
//            //now this divide method will create object and send it to jvm and then jvm seeks if we r handling the exception or not
//            int d = b / c;
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }


//    }
}


