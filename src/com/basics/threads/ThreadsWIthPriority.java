package com.basics.threads;//MaxP=10, MinP=1, NormP=5
public class ThreadsWIthPriority extends Thread {
    public void run(){
        for( int i=1; i<=3; i++){
            System.out.println(Thread.currentThread().getName() + " | Priority: "
                    + Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        ThreadsWIthPriority t1 = new ThreadsWIthPriority();
        ThreadsWIthPriority t2 = new ThreadsWIthPriority();
        ThreadsWIthPriority t3 = new ThreadsWIthPriority();
        t1.setName("Low Priority Thread name");
        t2.setName("Medium Priority Thread name ");
        t3.setName("High priority Thread name");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        // t1.setPriority(11); //Illegal argument exception
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
🟥Points to remember
⭐Thread Priority is only a suggestion to the JVM or Scheduler
⭐Higher Priority doesn't guarantee earlier order of execution
⭐Higher priority Threads may get more CPU time by the Scheduler
⭐The action behaviour depends on JVM or Operating system
 */
