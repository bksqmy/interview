package com.respect.interview.io;

import java.io.*;  

/** 
 * Created by 111 on 2016/1/29. 
 */  
public class Demo1 {  
  
    public static void main(String [] args){  
        File file = new File("d:/helloWorld.txt");  
        InputStream in = null;  
        try {  
            if (!file.exists()){                              //�ļ��������򴴽�  
                file.createNewFile();  
            }  
            in = new FileInputStream(file);  
            byte [] buf = new byte[1024];                 //��д�������У�Ȼ����һ��д������������  
            int length = 0;                           
            while ((length=in.read(buf))!=-1){                //-1 represent the end of the file is reached    ��  
                                                            //�ֽ�һ��һ���ض��뵽�ڴ�  
                System.out.println(new String(buf,0,length)); //��Ҫ��intתΪ�ֽڣ����Ϊ���ĵĻ���������ַ�  ��  
                                                     //�˴���ʵ��д���������裨����̨���ϣ�System.out���ص���PrintStream����  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }finally {  
            if (in != null){  
                try {  
                    in.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }
}