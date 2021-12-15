//3. 실행결과를 쓰시오.
package com.codingtest;

class SimpleThread extends Thread{
    public SimpleThread(String name){
        super(name);
    }
    public void run(){
        System.out.println(getName()+" is now running");
    }
}

public class SimpleThreadTest {
    public static void main(String[] args) throws Exception{
        SimpleThread t = new SimpleThread("SimpleThread");
        System.out.println("Here : 1");
        t.start();
        Thread.sleep(1000);
        System.out.println("Here : 2");
    }
}
/*
Here : 1
SimpleThread is now running
Here : 2
 */
