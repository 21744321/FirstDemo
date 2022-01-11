package com.example.demo.controller;

import com.example.demo.Dto.ChangingName;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    private String changedName = "Matilda";

    @GetMapping("/hello")
    public String hello(ChangingName name)
    {
        return "Hello user " + changedName;
    }

    @PostMapping("/name")
    public String takeNameToChange(@RequestBody ChangingName name)
    {
        changedName = name.getName();
        return "Name to change is: " + name.getName();
    }

}
