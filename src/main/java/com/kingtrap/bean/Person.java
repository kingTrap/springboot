package com.kingtrap.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix="person")
@Data
public class Person {
    private String name;
    private int age;
    private Boolean boss;
    private Date birth;
    private List<String> books;
    private Map<String,Object> attrs;
    private Hello hello;
}
