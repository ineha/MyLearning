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

    }
}
