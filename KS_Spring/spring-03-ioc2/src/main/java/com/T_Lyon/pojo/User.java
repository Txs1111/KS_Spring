package com.T_Lyon.pojo;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
        System.err.println("�޲ι��췽����set�вι��췽��");
    }

    public User() {
        System.err.println("�޲ι��췽����set���췽��");
    }

    public void show() {
        System.err.println("�޲ι��췽����show������" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.err.println("�޲ι��췽����set���������ñ���");
    }
}
