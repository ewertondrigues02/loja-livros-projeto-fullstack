package com.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookStore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
