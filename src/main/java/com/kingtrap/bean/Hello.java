package com.kingtrap.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//指定配置文件读取配置，缺陷是无法使用yaml的文件格式
@PropertySource(value = {"classpath:hello.yaml"})
@ConfigurationProperties(prefix = "hello")
public class Hello{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  "姓名："+ name +",年龄："+ age ;
    }
}
