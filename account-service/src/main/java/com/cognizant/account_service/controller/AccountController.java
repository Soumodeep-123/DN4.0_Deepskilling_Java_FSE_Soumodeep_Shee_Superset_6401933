package com.cognizant.account_service.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class AccountController {

	@GetMapping("/accounts/{number}")
	public Map<String, Object> getAccount(@PathVariable String number) {
        Map<String, Object> response = new HashMap<>();
        response.put("number", number);
        response.put("type", "savings");
        response.put("balance", 234343);
        return response;
    }
	
}
