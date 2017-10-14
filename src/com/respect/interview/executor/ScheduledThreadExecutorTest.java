package com.respect.interview.executor;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
 * 通过实现Runnable接口，实现多线程
 * Runnable类是有run()方法的；
 * 但是没有start方法
 * 参考：
 * 
http://blog.csdn.net/qq_31753145/article/details/50899119

 * */

public class ScheduledThreadExecutorTest{
     

    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
       ScheduledThreadPoolExecutor exec =new ScheduledThreadPoolExecutor(1);
       exec.scheduleAtFixedRate(new Runnable(){//每隔一段时间就触发异常

        @Override
        public void run() {
            // TODO Auto-generated method stub
            //throw new RuntimeException();
            System.out.println("===================");
            
        }}, 1000, 5000, TimeUnit.MILLISECONDS);  
       
       exec.scheduleAtFixedRate(new Runnable(){//每隔一段时间打印系统时间，证明两者是互不影响的

        @Override
        public void run() {
            // TODO Auto-generated method stub
            System.out.println(System.nanoTime());
            
        }}, 1000, 2000, TimeUnit.MILLISECONDS);
        
     
        
     

    }

}