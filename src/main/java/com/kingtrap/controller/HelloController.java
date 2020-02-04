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
        return hello.toString() ;
    }

    public static void main(String[] args) {
        log.info("main...");
    }
}
