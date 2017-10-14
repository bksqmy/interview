package com.respect.interview.reflect;

public class Person {  
    private String name;  
    private String gender;  
    private int age;  
      
    private Person() {  
    //  
    }  
    public Person(String name, String gender, int age) {  
        super();  
        this.name = name;  
        this.gender = gender;  
        this.age = age;  
    }  
    //getter����setter����  
    private String getName() {  
        return name;  
    }  
    private void setName(String name) {  
        this.name = name;  
    }  
    public String getGender() {  
        return gender;  
    }  
    public void setGender(String gender) {  
        this.gender = gender;  
    }  
    public int getAge() {  
        return age;  
    }  
    public void setAge(int age) {  
        this.age = age;  
    }  
      
    public String toString(){  
        return "������"+name+"����: "+age;  
    }  
} 