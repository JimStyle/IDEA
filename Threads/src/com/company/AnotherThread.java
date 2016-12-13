package com.company;

import static com.company.ThreadColor.ANSI_BLUE;

/**
 * Created by arteman on 13.12.16.
 */
public class AnotherThread extends Thread{
    @Override
    public void run() {
        //super.run();
        System.out.println(ANSI_BLUE+"Hello from"+currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE+"Another thread woke me up");
            return;
        }
        System.out.println(ANSI_BLUE+"Three seconds passed");
    }
}
