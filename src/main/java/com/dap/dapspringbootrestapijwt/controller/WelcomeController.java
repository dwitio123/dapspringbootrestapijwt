package com.dap.dapspringbootrestapijwt.controller;
/*
IntelliJ IDEA 2024.3.2.2 (Community Edition)
Build #IC-243.23654.189, built on January 29, 2025
@Author TGS a.k.a. Dwitio Ahmad Pranoto
Java Developer
Created on 04/02/2025 17:23
@Last Modified 04/02/2025 17:23
Version 1.0
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/authz")
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcomeBroh() {
        return "Welcome Buddy";
    }
}
