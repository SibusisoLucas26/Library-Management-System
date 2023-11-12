package com.example.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.books.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	//Book saveBook(Book book);

	// Book editBook(Book book);

	// Book findById(Long id);

	//void deleteById(Long id);

	//List<Book> findAll();

}
