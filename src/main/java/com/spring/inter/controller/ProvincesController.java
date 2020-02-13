package com.spring.inter.controller;

import com.spring.inter.bean.Provinces;
import com.spring.inter.repository.ProvincesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class ProvincesController {
    @Autowired(required = false)
    private ProvincesRepository provincesRepository;

//    @RequestMapping("queryAll")
    @RequestMapping("/provinces")
    public List<Provinces> queryAll(){
        List<Provinces> list = new ArrayList<Provinces>();
        list = provincesRepository.findAll();
        return list;
    }

}
