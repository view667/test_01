package Runnable;

import java.util.TreeMap;

class R_01_demo implements Runnable01{
    private Thread t;
    private String threadName;

    R_01_demo(String name){
        threadName = name;
        System.out.println("Creating" + threadName);
    }

    public void run(){
        System.out.println("Running " + threadName);
        try {
            for(int i=4; i>0; i--){
                System.out.println("thread:"+ threadName+","+i);
                //线程睡一会
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("thread:"+ threadName + "interrupted");
        }
        System.out.println("thread:"+ threadName + "exiting");
    }

    public void start(){
        System.out.println("Starting" + threadName);
        if(t == null){
            t = new Thread((Runnable) this, threadName);
            t.start();
        }
    }
}

