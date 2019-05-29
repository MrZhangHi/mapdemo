package com.example.demo666;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("index1")
    public String index(){
        return "hello";
    }

    @RequestMapping("demo")
    public String demo(){
        return "index";
    }
}
