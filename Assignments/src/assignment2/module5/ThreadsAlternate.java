package assignment2.module5;
class Thread1 extends Thread {
    public void run() {
        for(int i=1;i<=7;i+=2) {
            System.out.println("Thread1: " + i);
        }
    }
}
class Thread2 extends Thread {
    public void run() {
        for(int i=2;i<=8;i+=2) {
            System.out.println("Thread2: " + i);
        }
    }
}
public class ThreadsAlternate {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}