package com.kingtrap.controller;

import com.kingtrap.bean.Hello;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class HelloController {

    @Autowired Hello hello;

    @RequestMapping("/sayHello")
    public String sayHello(){
        String s = "Hello " + hello + "!";
        String s1 = "Hello " + hello + "1!";
        String s2 = "Hello " + hello + "2!";
        return s2;
    }

    public static void main(String[] args) {
        log.info("main...");
    }
}
