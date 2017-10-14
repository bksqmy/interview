package com.respect.interview.reflect;

import java.lang.reflect.Constructor;  
import java.lang.reflect.Field;  
import java.lang.reflect.Method;  
  
import javax.swing.JOptionPane;  
  
/** 
 * ͨ���û��������ȫ·��������ȡ����ĳ�Ա���������� 
 * Declared��ȡȫ��������˽�к͹��� 
 * 1.��ȡ�������Class���� 
 * 2.����Class����ķ������ط�����ķ�����������Ϣ 
 **/  
  
public class ReflectDemo1 {  
  
    /* 
     * ���췽�� 
     */  
    public ReflectDemo1(){  
        //�û��������ȫ·����  
        //ʹ��String���  
        String classpsth=JOptionPane.showInputDialog(null,"�������ȫ·��");  
        //
        //ʹ��Class.forName����������������ȫ·�� ���ظ����Class����  
        try {  
            Class cla = Class.forName(classpsth);  
            //����Class�����cla������,���ط������󼯺�  
            Method [] method=cla.getDeclaredMethods(); //�������еķ���  
            System.out.println("========��ȡ������Ϣ============");  
            for (Method meth : method) {  
                //����method���飬�����������Ϣ  
                System.out.println(meth.toString());  
            }  
            System.out.println("========��ȡ��������Ϣ����============");  
            //��ȡ��������Class�����cla������,���س�Ա���Զ��󼯺�  
             Field [] field=cla.getDeclaredFields();  
                System.out.println("========��ȡ��Ա������Ϣ============");  
                for (Field f : field) {  
                    System.out.println(f.toString());  
                }  
                System.out.println("========��ȡ��Ա������Ϣ����============");  
            //��ȡ��������Class�����cla������,���ع��췽������  
                Constructor [] constructor=cla.getDeclaredConstructors();  
                System.out.println("========��ȡ��Ա���췽����Ϣ============");  
                for (Constructor constru : constructor) {  
                    System.out.println(constru.toString());  
                }  
                System.out.println("========��ȡ��Ա���췽����Ϣ����============");  
        } catch (ClassNotFoundException e) {  
            e.printStackTrace();  
            System.out.println("·���������");  
        }  
    }  
} 