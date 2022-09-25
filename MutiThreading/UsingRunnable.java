package MutiThreading;

public class UsingRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        UsingRunnable usingRunnable=new UsingRunnable();

        Thread t1=new Thread(usingRunnable);
        t1.start();
        System.out.println("end");
        System.out.println("end2");

    }
}
