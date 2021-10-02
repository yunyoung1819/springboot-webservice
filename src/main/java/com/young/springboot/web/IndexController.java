package com.young.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        System.out.println("POSTS SAVE API 호출");
        return "posts-save";
    }
}
