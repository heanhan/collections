package com.example.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户菜单
 * @author zhaojh0912
 */

@RestController
@RequestMapping(value = "/menu")
public class MenuController {


    /**
     * 根据根据用户的角色获取对应的菜单
     * @return
     */
    @GetMapping(value = "/getMenuByUser")
    public String getMenuByUser(){

        return null;
    }
}
