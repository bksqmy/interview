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
            if (!file.exists()){                              //文件不存在则创建  
                file.createNewFile();  
            }  
            in = new FileInputStream(file);  
            byte [] buf = new byte[1024];                 //先写到缓存中，然后再一起写到其他外设中  
            int length = 0;                           
            while ((length=in.read(buf))!=-1){                //-1 represent the end of the file is reached    ，  
                                                            //字节一个一个地读入到内存  
                System.out.println(new String(buf,0,length)); //需要将int转为字节，如果为中文的话输出乱码字符  ，  
                                                     //此处其实是写出到了外设（控制台）上，System.out返回的是PrintStream对象  
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