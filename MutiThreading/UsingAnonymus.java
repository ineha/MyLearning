package MutiThreading;

public class UsingAnonymus {

    public static void main(String[] args) {

        System.out.println("threading started");

        //using anonymus class and runnable is the interfce which this class implements
        Runnable at1=new Runnable() {
            @Override
            public void run() {
                System.out.println("thread starts");
            }
        };

        Thread thread=new Thread(at1);
        thread.start();

        System.out.println("using functional interface");
        //Runnable is a fucntional interface and it will call its abstract method run
        Runnable t=()->{
            System.out.println("calling run method");
        };
        Thread thread2=new Thread(t);
        thread2.start();
    }
}
