package com.kobe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {
    @RequestMapping("/pageshow")
    public String pagemobile(){
        return "pageshow";
    }
}
