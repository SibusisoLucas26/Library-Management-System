package com.example.books.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.books.entity.Book;
import com.example.books.repository.BookRepository;

@Service
public class serviceMethods implements serviceInterface {

	@Autowired
	BookRepository bookRepository;

	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);
	}

	@Override
	public Book getById(Long id) {
		// TODO Auto-generated method stub
		// return bookRepository.findById(id);
		return bookRepository.findById(id).get();
	}

	@Override
	public Book editBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method
		// 'getAllBooks'");
		return bookRepository.findAll();
	}

}
