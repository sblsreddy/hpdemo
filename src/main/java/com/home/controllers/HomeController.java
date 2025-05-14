package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String getHome() {
        // it will be considered as a file ( jsp) not as content
        return "/WEB-INF/views/home.jsp";
    }
}
