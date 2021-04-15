package com.T_Lyon.pojo;

import javax.annotation.Resource;

public class People {
    //@Autowired
    //@Qualifier(value = "cat11")

    @Resource(name = "cat1")
    private Cat cat;
    //@Autowired
    //@Qualifier(value="dog222")

    @Resource
    private com.T_Lyon.pojo.Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public com.T_Lyon.pojo.Dog getDog() {
        return dog;
    }

    public void setDog(com.T_Lyon.pojo.Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
