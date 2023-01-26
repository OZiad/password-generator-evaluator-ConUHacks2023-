package com.passwordgenerator.passgen.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/password")
public class passwordGeneratorController {
    @GetMapping
    public String hello() {
        return "testing 123";
    }
}       