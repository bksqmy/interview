package com.respect.interview.executor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.respect.interview.thread.MyThread;

/*
 * ͨ��ʵ��Runnable�ӿڣ�ʵ�ֶ��߳�
 * Runnable������run()�����ģ�
 * ����û��start����
 * �ο���
 * 
http://blog.csdn.net/qq_31753145/article/details/50899119

 * */

public class SingleThreadExecutorTest{
     

    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        //����һ�������ù̶��߳������̳߳�
        ExecutorService pool=Executors.newSingleThreadExecutor();
        
        //����ʵ����Runnable�ӿڶ���Thread����ȻҲʵ����Runnable�ӿ�;
        
        
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
        
        //���̷߳ŵ�����ִ�У�
        
        pool.execute(t1);

        pool.execute(t2);

        pool.execute(t3);

        pool.execute(t4);

        pool.execute(t5);
        
        //�ر��̳߳�
        
       pool.shutdown();
        
     

    }

}