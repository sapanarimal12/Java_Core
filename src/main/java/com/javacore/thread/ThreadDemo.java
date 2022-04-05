package com.javacore.thread;


class ThreadDemo implements Runnable {

    public void run() {
        try {
            System.out.println("Thread:" + Thread.currentThread().getId() + " iS running");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
        public static void main(String[] args) {
//            int n = 5;
//            for (int i = 0; i < n; i++) {
                Thread t = new Thread(new ThreadDemo());
                t.start();
            }
        }


