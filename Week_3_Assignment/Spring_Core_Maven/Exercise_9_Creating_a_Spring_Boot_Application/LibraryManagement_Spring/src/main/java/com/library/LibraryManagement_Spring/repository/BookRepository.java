package com.library.LibraryManagement_Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.library.LibraryManagement_Spring.entity.book;

public interface BookRepository extends JpaRepository<book, Long> {

}
