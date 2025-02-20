package com.viveksingh.spring_sample_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeComputer
{
    @GetMapping
    public String index() {
        return "This is my new Spring Boot Application";
    }
}
