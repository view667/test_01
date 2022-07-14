package Runnable;

public class test_Thread {
    public static void main(String args[]){
        R_01_demo R1 = new R_01_demo("Thread-1");
        R1.run();

        R_01_demo R2 = new R_01_demo("Thread-2");
        R2.run();

    }
}
