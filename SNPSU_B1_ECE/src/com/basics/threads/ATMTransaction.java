package com.basics.threads;

public class ATMTransaction extends Thread{
    public void run(){
        System.out.println("Processing ATM Transaction!");
    }

    public static void main(String[] args) {
        ATMTransaction tx = new ATMTransaction();
        System.out.println("Thread State before start(): " + tx.getState());//NEW -> Object Created
        tx.start();
        System.out.println("Thread State after start(): " + tx.getState());//RUNNABLE

    }
}
/*
🟢Code Explanation
⭐Initially the thread is in the new state.
 after calling start() ,it moves to runnable state and is executes the run() method.
⭐The exact timing of state change will depend on JVM scheduler.
🟥Points to remember:
⭐Thread is created only once
⭐start() changes the state
⭐Thread cannot be restarted
⭐Final state is DEAD or TERMINATED
🟧Bullet points for Interviews/Placements
🟢A thread can be created by extending the Thread class and overriding the run() method
🟢start() creates a new thread
🟢Calling run() directly(❌ No Multithreading)
 */
