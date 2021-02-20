package com.wei.pojo;

public class UserT {

    private String name;

    public UserT() {
        System.out.println("User T created");
    }

    public UserT(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
