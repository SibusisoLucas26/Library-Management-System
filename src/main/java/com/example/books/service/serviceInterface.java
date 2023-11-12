package com.example.books.service;

import java.util.List;

import com.example.books.entity.Book;

public interface serviceInterface {

    void saveBook(Book book);

    Book getById(Long id);

    Book editBook(Book book);

    void deleteById(Long id);

    // List<Book> bookList();

    List<Book> getAllBooks();

}
