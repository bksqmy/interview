package com.respect.interview.executor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.respect.interview.thread.MyThread;

/*
 * 创建一个单线程的线程池。这个线程池只有一个线程在工作，也就是相当于单线程串行执行所有任务。
 * 如果这个唯一的线程因为异常结束，那么会有一个新的线程来替代它。
 * 此线程池保证所有任务的执行顺序按照任务的提交顺序执行。
 * 
 * 通过实现Runnable接口，实现多线程
 * Runnable类是有run()方法的；
 * 但是没有start方法
 * 参考：
 * 
http://blog.csdn.net/qq_31753145/article/details/50899119

 * */

public class SingleThreadExecutorTest{
     

    public static void main(String[] args) {
 
        //创建一个可重用固定线程数的线程池
        ExecutorService pool=Executors.newSingleThreadExecutor();
        
        //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口;
        
        
        Thread t1=new MyThread();
        t1.setName("t1");
        
        Thread t2=new MyThread();
        t2.setName("t2");
        
        Thread t3=new MyThread();
        t3.setName("t3");
        
        Thread t4=new MyThread();
        t4.setName("t4");
        
        Thread t5=new MyThread();
        t5.setName("t5");
        
        //将线程放到池中执行；
        
        pool.execute(t1);

        pool.execute(t2);

        pool.execute(t3);

        pool.execute(t4);

        pool.execute(t5);
        
        //关闭线程池
        
       pool.shutdown();
        
     

    }

}