package com.kingtrap.controller;

import com.kingtrap.bean.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/person/*")
@Log
@Api(tags = "人员管理相关接口")
public class PersonController {

    @Autowired
    private Person person;

    @GetMapping("/getPerson")
    //@ResponseBody 不需要该注解也可以返回json数据
    public Map getPerson(){

        Map result = new HashMap();
        result.put("person",person);

        return result;
    }

    @GetMapping("/get/{id}")
    //@ResponseBody 不需要该注解也可以返回json数据
    @ApiOperation("根据id查询用户的接口")
    @ApiImplicitParam(name = "id", value = "人员id", defaultValue = "99", required = true)
    public Map get(@PathVariable Integer id){

        if(id.intValue() == 20){
            throw  new UnsupportedOperationException("");
        }
        Map result = new HashMap();
        result.put("person",person);

        return result;
    }
}
