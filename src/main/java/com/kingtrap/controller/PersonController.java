package com.kingtrap.controller;

import com.kingtrap.bean.Person;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Log
public class PersonController {

    @Autowired
    private Person person;

    @RequestMapping("/getPerson")
    //@ResponseBody 不需要该注解也可以返回json数据
    public Map getPerson(){

        Map result = new HashMap();
        result.put("person",person);

        return result;
    }
}
