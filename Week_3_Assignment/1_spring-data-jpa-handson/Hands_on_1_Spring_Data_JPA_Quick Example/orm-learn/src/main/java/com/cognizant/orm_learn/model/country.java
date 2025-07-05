package com.cognizant.orm_learn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class country {
	
	 @Id
	    private String code;
	    private String name;

	    
	    public String getcode() {
	        return code;
	    }

	    public void setCoCode(String code) {
	        this.code = code;
	    }

	    public String getname() {
	        return name;
	    }

	    public void setCoName(String name) {
	        this.name = name;
	    }
	
}
