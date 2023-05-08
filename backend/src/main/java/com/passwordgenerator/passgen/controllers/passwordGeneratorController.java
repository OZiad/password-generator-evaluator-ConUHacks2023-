package com.passwordgenerator.passgen.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class passwordGeneratorController {

    // REST API that returns password strength as a string (weak, medium or strong)
    @GetMapping("/{password}")
    public String passwordStrength(@PathVariable String password) {
        int strength = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                strength += 2;
            } else if (Character.isLowerCase(c)) {
                strength++;
            } else if (Character.isUpperCase(c)) {
                strength += 2;
            } else if (c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '+') {
                strength += 3;
            }
        }
        double entropy = 0.0;
        int[] charCounts = new int[Character.MAX_CODE_POINT + 1]; // Unicode characters can have a maximum value of
                                                                  // Character.MAX_CODE_POINT
        for (int i = 0; i < password.length(); i++) {
            charCounts[password.codePointAt(i)]++;
        }
        for (int i = 0; i <= Character.MAX_CODE_POINT; i++) {
            if (charCounts[i] > 0) {
                double probability = (double) charCounts[i] / password.length();
                entropy += probability * (Math.log(probability) / Math.log(2));
            }
        }
        entropy = -entropy;

        if (entropy >= 3) {
            strength += 5;
        }
        if (strength >= 0 && strength <= 21) {
            return "weak";
        } else if (strength > 21 && strength <= 30) {
            return "medium";
        } else {
            return "strong";
        }
    }

    // @GetMapping("/{length}/{upperCase}/{lowerCase}/{nums}/{symbols}")
    // public int passwordStrength(@PathVariable int length, @PathVariable boolean
    // upperCase,
    // @PathVariable boolean lowerCase, @PathVariable boolean nums, @PathVariable
    // boolean symbols) {

    // return 0;
    // }
    @GetMapping("/passwordGenerator")
    public int passwordStrength(@RequestParam(defaultValue = "10", required = false) Integer length,
            @RequestParam(defaultValue = "true", required = false) boolean upperCase,
            @RequestParam(defaultValue = "true", required = false) boolean lowerCase,
            @RequestParam(defaultValue = "true", required = false) Boolean nums,
            @RequestParam(required = false) boolean symbols) {
        return length;
    }

    @GetMapping("/")
    public String[] hello() {
        String[] hello = { "ha", "ha", "ha" };
        return hello;
    }
}