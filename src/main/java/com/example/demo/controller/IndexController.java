package com.example.demo.controller;

import ch.qos.logback.classic.Logger;
import com.example.demo.bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 周瑶
 * @description TODO
 * @Date: 2018/11/6
 */
//restful风格
@RestController
@RequestMapping(value = "index")
public class IndexController {


    @Value(value = "${random.value}")
    private String randomValue;

    @Value(value = "${random.int}")
    private  Long number;



    @RequestMapping
    public String index(){
        return "hello world!";
    }

    @RequestMapping(value = "get")
    public Map<String,Object> get(@RequestParam String name){
        Map<String,Object> map=new HashMap<>();
        map.put("name",name);
        map.put("value","hello world");
        map.put("randomValue",randomValue);
        map.put("number",number);

        return map;
    }

    @RequestMapping(value = "find/{id}/{name}")
    public User get(@PathVariable int id,@PathVariable String name){
        User u=new User();
        u.setId(id);
        u.setName(name);
        u.setDate(new Date());
        return u;

    }
}
