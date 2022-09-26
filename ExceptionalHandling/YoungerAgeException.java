package ExceptionalHandling;

public class YoungerAgeException extends RuntimeException{
    //creating unchecked exception class

        YoungerAgeException(String msg){
            //super lgaya h kunki ye wala msg default exceptionl handler ko available rhe
            super(msg);
        }
    }

