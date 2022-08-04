package MutiThreading;

//creating thread using Thread class
public class MyAnotherThread extends Thread {

    public void run(){
        for(int i =9;i>0;i--) {
            System.out.println("Another Thread =" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        //creating object of MyThread
        MyThread t= new MyThread();
        Thread t1 = new Thread(t);
        t1.start();
        //creating object of MyAnotherThread
        MyAnotherThread t2 = new MyAnotherThread();
        t2.start();
    }
}
