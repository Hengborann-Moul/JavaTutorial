package Multithreading;

/**
 * Created by tadashii on 1/21/17.
 */
public class Extending_Thread_Class extends Thread{

    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String args[]){
        Extending_Thread_Class t1=new Extending_Thread_Class();
        t1.start();
    }
}
