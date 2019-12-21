package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellow {
@RequestMapping("/hellow")
public String hellow() {
    return "hello";
}
}
