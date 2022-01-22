package com.BookstoreDemo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookstoreDemo.demo.datamodel.Book;
import com.BookstoreDemo.demo.repository.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;
	
	public List<Book> findBooks(){
		return bookRepo.findAll();
	}
	
	public Optional<Book> fetchBook(int id){
		return bookRepo.findById(id);
	}
	
	public Book fetchLatestBook() {
		List<Book> all = findBooks();
		Book latest = all.get(0);
		for(Book b: all) {
			latest = b.getYear() > latest.getYear() ? b : latest; 
		}
		return latest;
	}
	
	public Book fetchOldestBook() {
		List<Book> all = findBooks();
		Book oldest = all.get(0);
		for(Book b: all) {
			oldest = b.getYear() < oldest.getYear() ? b : oldest; 
		}
		return oldest;
	}
	
	public Book addBook(Book book) {
		return bookRepo.save(book);
	}
	
	public boolean deleteBook(int id) {
		boolean status;
		try {
			bookRepo.deleteById(id);
			status = true;
		}catch(Exception e) {
			status = false;
		}
			return status;
		}
}

