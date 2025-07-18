package com.cognizant.loan_service.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class LoanController {
	
	@GetMapping("/loans/{number}")
    public Map<String, Object> getLoanDetails(@PathVariable String number) {
        Map<String, Object> loan = new HashMap<>();
        loan.put("number", number);
        loan.put("type", "car");
        loan.put("loan", 400000);
        loan.put("emi", 3258);
        loan.put("tenure", 18);
        return loan;
    }

}
