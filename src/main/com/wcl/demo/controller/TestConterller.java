package com.wcl.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConterller {

    @RequestMapping("/1004423")
    public String Test(){

        return "123";
    }



}
