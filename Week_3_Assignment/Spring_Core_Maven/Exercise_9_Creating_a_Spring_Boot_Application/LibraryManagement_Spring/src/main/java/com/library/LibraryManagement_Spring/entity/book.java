package com.library.LibraryManagement_Spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class book {
	
	@Id
	private Long id;
	private String title;
	private String author;
	
	public book() {}
	
	public book(Long id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public Long getid() {
		return id;
	}
	
	public void setid( Long id ) {
		this.id = id;
	}
	
	public String gettitle() {
		return title;
	}
	
	public void settitle( String title ) {
		this.title = title;
	}
	
	public String getauthor() {
		return author;
	}
	
	public void setauthor( String author ) {
		this.author = author;
	}
	
}
