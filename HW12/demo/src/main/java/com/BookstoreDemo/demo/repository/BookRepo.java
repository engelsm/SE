package com.BookstoreDemo.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.BookstoreDemo.demo.datamodel.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{

}
