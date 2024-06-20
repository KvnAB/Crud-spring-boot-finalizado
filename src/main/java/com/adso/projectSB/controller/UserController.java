package com.adso.projectSB.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
