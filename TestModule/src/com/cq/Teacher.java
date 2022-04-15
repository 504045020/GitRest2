package com.cq;

public class Teacher {
    private String name;
    private int    age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void teaching(){
        System.out.println(name+"正在教学");
    }
}
