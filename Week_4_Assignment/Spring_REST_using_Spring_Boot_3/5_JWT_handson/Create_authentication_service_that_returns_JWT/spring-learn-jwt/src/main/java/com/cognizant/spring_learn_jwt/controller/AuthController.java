package com.cognizant.spring_learn_jwt.controller;

import com.cognizant.spring_learn_jwt.model.User;
import com.cognizant.spring_learn_jwt.Utility.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {
	
	@GetMapping("/test")
    public String test() {
        System.out.println("Inside /test endpoint");
        return "Controller is working!";
    }


    @PostMapping("/authenticate")
    public String generateToken(@RequestBody User user) throws Exception {
    	
    	System.out.println("Inside /authenticate");
        System.out.println("Username: " + user.getUsername()); 
    	
        if ("admin".equals(user.getUsername()) && "password".equals(user.getPassword())) {
            return JwtUtil.generateToken(user.getUsername());
        } else {
            throw new Exception("Invalid username/password");
        }
    }
}
