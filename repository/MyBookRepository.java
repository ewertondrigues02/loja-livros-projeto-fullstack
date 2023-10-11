package com.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookStore.entity.MyBookList;

public interface MyBookRepository extends JpaRepository<MyBookList, Integer> {

}
