package com.T_Lyon.pojo;

public class UserConstructor {
    private String name;

    public UserConstructor(String name) {
        this.name = name;
        System.out.println("有参构造方法：有参构造方法");
    }

    public UserConstructor() {
        System.out.println("有参构造方法：无参构造方法");
    }

    public void show() {
        System.out.println("有参构造方法：show方法：" + name);
    }

    public String getName() {
        return name;
    }

}
