package com.T_Lyon.pojo;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
        System.err.println("无参构造方法：set有参构造方法");
    }

    public User() {
        System.err.println("无参构造方法：set构造方法");
    }

    public void show() {
        System.err.println("无参构造方法：show方法：" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.err.println("无参构造方法：set方法：设置变量");
    }
}
