package com.cq;

public class Student {
    private String name;
    private int    age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study(){
        System.out.println(name+"正在学习");
    }
}
