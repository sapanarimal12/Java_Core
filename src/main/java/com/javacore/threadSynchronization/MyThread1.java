package com.javacore.threadSynchronization;

public  class MyThread1 extends Thread {
     ThreadExample t;
     MyThread1(ThreadExample t) {
         this.t = t;
     }

      public void run() {
         t.printTable(10);
        }

}
