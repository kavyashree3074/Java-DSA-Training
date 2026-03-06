package com.basics.threads;
public class FestRegistration {
    //Form fillup
    static class FormFilling extends Thread {
        public void run() {
            System.out.println("Form filling started.");
        }
    }

    // Upload Documents
    static class UploadDoc extends Thread {
        public void run() {
            System.out.println("Doc Upload started.");
        }
    }

        //Email Notification
        static class EmailNotification extends Thread {
            public void run() {
                System.out.println("Email notification sent.");
        }
    }


    public static void main(String[] args) {
                FormFilling t1 = new FormFilling();
                UploadDoc t2 = new UploadDoc();
                EmailNotification t3 = new EmailNotification();
                t1.start();
                t2.start();
                t3.start();
    }
}
/*
Points to remember:
⭐Java program starts with one main thread
⭐Threads allow "parallel execution" -> Concurrency
⭐Output order i never guaranteed
⭐Threads share the same memory
⭐Improves the performance and responsiveness
⭐When start() is called, the JVM creates a new thread
⭐When run() is called directly, there is no concurrency
 🟥 PROCESS vs THREAD
 ⭐Process is running a program
 ⭐Thread is a path of execution inside the program
 ⭐A process has its own memory
 ⭐Threads share the same memory
 ⭐creating a Thread is cheaper than creating a process
 🟢Example:-
 ⭐Process -> Google Chrome browser; Thread -> New tab in Chrome
 ⭐Closing a tab will not close Chrome or will not kill Chrome
 */

