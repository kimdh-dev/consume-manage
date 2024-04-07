package com.kdh.consumemanage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("/hello_spring")
    @ResponseBody
    public String hello_spring() {
        return "hello spring boot 3";
    }
}
