package com.respect.interview.executor;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
 * ͨ��ʵ��Runnable�ӿڣ�ʵ�ֶ��߳�
 * Runnable������run()�����ģ�
 * ����û��start����
 * �ο���
 * 
http://blog.csdn.net/qq_31753145/article/details/50899119

 * */

public class ScheduledThreadExecutorTest{
     

    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
       ScheduledThreadPoolExecutor exec =new ScheduledThreadPoolExecutor(1);
       exec.scheduleAtFixedRate(new Runnable(){//ÿ��һ��ʱ��ʹ����쳣

        @Override
        public void run() {
            // TODO Auto-generated method stub
            //throw new RuntimeException();
            System.out.println("===================");
            
        }}, 1000, 5000, TimeUnit.MILLISECONDS);  
       
       exec.scheduleAtFixedRate(new Runnable(){//ÿ��һ��ʱ���ӡϵͳʱ�䣬֤�������ǻ���Ӱ���

        @Override
        public void run() {
            // TODO Auto-generated method stub
            System.out.println(System.nanoTime());
            
        }}, 1000, 2000, TimeUnit.MILLISECONDS);
        
     
        
     

    }

}