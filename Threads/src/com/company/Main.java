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

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                //super.run();
                System.out.println(ANSI_RED+"Hello from anonymous class impl of run");
                try {
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED+"Another thread terminated");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED+"I was interrupted");
                }
            }
        });
        myRunnableThread.start();
       // anotherThread.interrupt();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread");
    }
}
