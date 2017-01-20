package Multithreading;

/**
 * Created by tadashii on 1/21/17.
 */
public class Runnable_Interface implements Runnable{

    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        Runnable_Interface m1=new Runnable_Interface();
        Thread t1 =new Thread(m1);
        t1.start();
    }
}
