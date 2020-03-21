package com.example.page.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaojh0912
 */

@RestController
@RequestMapping(value = "/index")
public class IndexController {

    /**
     * 发送字符串
     *
     * @param content 字符串内容
     * @return
     */
    @PostMapping(value = "/sendString")
    public String index(String content) {

        return "接收内容：" + content;
    }
}
