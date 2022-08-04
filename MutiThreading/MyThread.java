package MutiThreading;
//creating our thread using Runnable Inteeface
public class MyThread implements Runnable{

    //task for thread..
    public void run(){
        for(int i=0;i<10;i++) {
            System.out.println("Value of i :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread thread = new Thread(t);
        thread.start();
    }
}
