package com.example.jwtauth.controller;

import com.example.jwtauth.service.JwtService;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtService jwtService;

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            throw new RuntimeException("Missing or invalid Authorization header");
        }

        // Decode Base64
        String base64Credentials = authHeader.substring("Basic ".length());
        String credentials = new String(Base64.decodeBase64(base64Credentials));
        String[] parts = credentials.split(":", 2);

        String username = parts[0];
        String password = parts[1];

        if (!"user".equals(username) || !"pass".equals(password)) {
            throw new RuntimeException("Invalid credentials");
        }

        String token = jwtService.generateToken(username);
        return Collections.singletonMap("token", token);
    }
}
