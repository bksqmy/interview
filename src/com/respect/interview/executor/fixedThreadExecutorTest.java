package com.respect.interview.executor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.respect.interview.thread.MyThread;

/*
 * �����̶���С���̳߳ء�ÿ���ύһ������ʹ���һ���̣߳�ֱ���̴߳ﵽ�̳߳ص�����С��
 * �̳߳صĴ�Сһ���ﵽ���ֵ�ͻᱣ�ֲ��䣬���ĳ���߳���Ϊִ���쳣����������ô�̳߳ػᲹ��һ�����̡߳�
 * ͨ��ʵ��Runnable�ӿڣ�ʵ�ֶ��߳�
 * Runnable������run()�����ģ�
 * ����û��start����
 * �ο���
 * 
http://blog.csdn.net/qq_31753145/article/details/50899119

 * */

public class fixedThreadExecutorTest{
     

    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        //����һ�������ù̶��߳������̳߳�
        ExecutorService pool=Executors.newFixedThreadPool(2);
        
        //����ʵ����Runnable�ӿڶ���Thread����ȻҲʵ����Runnable�ӿ�;
        
        
        Thread t1=new MyThread();
        
        Thread t2=new MyThread();
        
        Thread t3=new MyThread();
        
        Thread t4=new MyThread();
        
        Thread t5=new MyThread();
        
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