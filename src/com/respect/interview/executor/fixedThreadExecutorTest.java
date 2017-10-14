package com.respect.interview.executor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.respect.interview.thread.MyThread;

/*
 * 创建固定大小的线程池。每次提交一个任务就创建一个线程，直到线程达到线程池的最大大小。
 * 线程池的大小一旦达到最大值就会保持不变，如果某个线程因为执行异常而结束，那么线程池会补充一个新线程。
 * 通过实现Runnable接口，实现多线程
 * Runnable类是有run()方法的；
 * 但是没有start方法
 * 参考：
 * 
http://blog.csdn.net/qq_31753145/article/details/50899119

 * */

public class fixedThreadExecutorTest{
     

    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        //创建一个可重用固定线程数的线程池
        ExecutorService pool=Executors.newFixedThreadPool(2);
        
        //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口;
        
        
        Thread t1=new MyThread();
        
        Thread t2=new MyThread();
        
        Thread t3=new MyThread();
        
        Thread t4=new MyThread();
        
        Thread t5=new MyThread();
        
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