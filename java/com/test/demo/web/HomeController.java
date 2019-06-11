package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * web
 */

@Controller
public class HomeController {
    @RequestMapping("/")
    public String name() {
        System.out.println("접속");
        return "index";

    }

}