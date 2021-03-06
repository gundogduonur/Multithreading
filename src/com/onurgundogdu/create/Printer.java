package com.onurgundogdu.create;

//public class Printer extends Thread {
public class Printer implements Runnable {
    private String name;

    public Printer(String name)
    {
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println(name+" running..");
        for (int i = 1; i <5 ; i++) {
            try
            {
                System.out.println(name+" printing : "+i);
                Thread.sleep(1000);
            }
            catch (InterruptedException interruptedException)
            {
                System.out.println("Interrupted Thread..");
            }
        }
        System.out.println(name + " finished.");

    }
}
