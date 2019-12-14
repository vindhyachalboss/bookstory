package com.vindhya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vindhya.model.BookRequest;



public interface BookMyShowRepository extends JpaRepository<BookRequest, Integer>{

}
