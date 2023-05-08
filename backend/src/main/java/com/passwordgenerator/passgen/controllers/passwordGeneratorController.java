package com.passwordgenerator.passgen.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class passwordGeneratorController {

    @GetMapping("/{password}")
    public int passwordStrength(@PathVariable String password) {
        return 0;
    }

    // @GetMapping("/{length}/{upperCase}/{lowerCase}/{nums}/{symbols}")
    // public int passwordStrength(@PathVariable int length, @PathVariable boolean
    // upperCase,
    // @PathVariable boolean lowerCase, @PathVariable boolean nums, @PathVariable
    // boolean symbols) {

    // return 0;
    // }
    @GetMapping("/passwordGenerator")
    public int passwordStrength(@RequestParam(defaultValue = "10" ,required = false) Integer length,
            @RequestParam(defaultValue="true",required = false) boolean upperCase,
            @RequestParam(defaultValue="true",required = false) boolean lowerCase, @RequestParam(defaultValue="true",required = false) Boolean nums,
            @RequestParam(required = false) boolean symbols) {
        return length;
    }

    @GetMapping("/")
    public String[] hello() {
        String[] hello = { "ha", "ha", "ha" };
        return hello;
    }
}