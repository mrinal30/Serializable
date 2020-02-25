package com.example.sable;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private String age;
    private String c;
    private String r;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void setR(String r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getC() {
        return c;
    }

    public String getR() {
        return r;
    }

    public Student(String name, String age, String c, String r) {
        this.name = name;
        this.age = age;
        this.c = c;
        this.r = r;
    }
}
