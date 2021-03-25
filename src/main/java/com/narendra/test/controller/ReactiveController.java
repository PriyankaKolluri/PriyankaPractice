package com.narendra.test.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/reactive")
public class ReactiveController {

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getString(){

        return "Hello Priyanka!";
    }
}
