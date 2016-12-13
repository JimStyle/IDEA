package com.company;

import static com.company.ThreadColor.ANSI_RED;

/**
 * Created by arteman on 13.12.16.
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(ANSI_RED+"Hello from runnables");
    }
}
