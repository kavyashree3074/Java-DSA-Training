package module5;
class ThreadLifeCycle extends Thread {
    public void run() {
        System.out.println("Thread Running");
    }
    public static void main(String[] args) {
        ThreadLifeCycle t = new ThreadLifeCycle();
        System.out.println("Thread State: " + t.getState());
        t.start();
        System.out.println("Thread State After Start: " + t.getState());
    }
}