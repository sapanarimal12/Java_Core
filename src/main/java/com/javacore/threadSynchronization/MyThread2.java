package com.javacore.threadSynchronization;

public class MyThread2 extends Thread {
    ThreadExample t;

    MyThread2(ThreadExample t) {
        this.t = t;
    }

    public void run() {
        t.printTable(4);
    }

}
