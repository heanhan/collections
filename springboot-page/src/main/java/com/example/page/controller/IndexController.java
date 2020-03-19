package com.example.page.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaojh0912
 */

@RestController
public class IndexController {

    @GetMapping(value = "/index")
    public String index(String name){

        return "hello !"+name;
    }
}
