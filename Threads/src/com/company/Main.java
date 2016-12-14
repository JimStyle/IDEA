package com.company;

import static com.company.ThreadColor.ANSI_GREEN;
import static com.company.ThreadColor.ANSI_PURPLE;
import static com.company.ThreadColor.ANSI_RED;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(ANSI_PURPLE+"Hello from the main thread");
        final Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread");
        anotherThread.start();

        new Thread() {
            public void run () {
                System.out.println(ANSI_GREEN+"Hello from anonymous");
            }
        }.start();

        //MyRunnable myRunnable = new MyRunnable();
        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                //super.run();
                System.out.println(ANSI_RED+"Hello from anonymous class impl of run");
                try {
                    //this.wait();
                    anotherThread.join();
                    //Thread.yield();
                    System.out.println(ANSI_RED+"Another thread terminated");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED+"I was interrupted");
                }
            }
        });
        System.out.println("myRunnable state : "+myRunnableThread.getState());
        myRunnableThread.setPriority(Thread.MIN_PRIORITY);
        myRunnableThread.start();
        //anotherThread.interrupt();
        System.out.println("myRunnable state : "+myRunnable.getState());
        System.out.println("anotherTread state : "+anotherThread.getState());
        if (anotherThread.isInterrupted()) {
            System.out.println("Another thread is terminated!!!!!!");
        }

        System.out.println(ANSI_PURPLE+"Hello again from the main thread");
    }
}
