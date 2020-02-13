package com.spring.inter.controller;

import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.inter.bean.User;
import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping
    public HashMap<String, String> index(){
        HashMap<String, String> hashmap = new HashMap<String, String>();

        User user= new User();
        user.setId(1);
        user.setName("lzc");
        user.setPass("123");
        user.setSex("male");
        String json=JSON.toJSONString(user);//关键

        hashmap.put("姓名", "王二");
        hashmap.put("年龄", "27");
        hashmap.put("工龄", "6");
        hashmap.put("info", json);
        return hashmap;
    }
}