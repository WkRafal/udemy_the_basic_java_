package com.exemple.threads.lifecycle;

class TestTread extends Thread{
    Thread mainThread;

    public TestTread(String name, Thread mainThread) {
        super(name);
        this.mainThread = mainThread;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started");
        try {
            for (int i = 0; i < 3; i++)
                Thread.sleep(1000);
            System.out.println("main state: " + mainThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " finished");
    }
}

public class WaitingState {
    public static void main(String[] args) throws InterruptedException {

        Thread mainThread = Thread.currentThread();//głowny watek main

        TestTread tread1 = new TestTread("thread1", mainThread);
        tread1.start();

        tread1.join();
        System.out.println("Main started");
    }
}
