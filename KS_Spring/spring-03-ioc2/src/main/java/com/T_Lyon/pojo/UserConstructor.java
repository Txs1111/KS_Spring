package com.T_Lyon.pojo;

public class UserConstructor {
    private String name;

    public UserConstructor(String name) {
        this.name = name;
        System.out.println("�вι��췽�����вι��췽��");
    }

    public UserConstructor() {
        System.out.println("�вι��췽�����޲ι��췽��");
    }

    public void show() {
        System.out.println("�вι��췽����show������" + name);
    }

    public String getName() {
        return name;
    }

}
