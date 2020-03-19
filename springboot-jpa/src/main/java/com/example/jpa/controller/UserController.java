package com.example.jpa.controller;

import org.springframework.web.bind.annotation.RestController;


/**
 * @author zhaojh0912
 */
@RestController
public class UserController {


    public void test() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
