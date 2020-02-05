package com.kingtrap.hello;

import com.kingtrap.bean.Hello;
import com.kingtrap.bean.Person;
import com.kingtrap.controller.HelloController;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class HelloApplicationTests {

    @Autowired
    private Hello hello;

    @Autowired
    private Person person;

    @Autowired
    private HelloController helloController;

    @Test
    public void contextLoads() {
        System.out.println(hello);
    }

    @Test
    public void sayHelloByConfiguration(){
        System.out.println(hello);
    }

    @Test
    public void printPerson(){
        log.info(person.toString());
    }

    @Test
    public void testSayHello(){
        System.out.println(helloController.sayHello());
    }
}
