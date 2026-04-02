package assignment2.module5;
class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is running....");
    }

    public static void main(String[] args) {
        MyThread t = new MyThread(); // create thread object
        t.start(); // start the thread
    }
}

