package com.example.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.books.entity.Book;
import com.example.books.repository.BookRepository;

@SpringBootApplication
public class SystemlibraryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SystemlibraryApplication.class, args);
	}

	@Autowired
	private BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'run'");
		Book book1 = new Book("Ellen Hildreth", "Kevin Molloy", 11135, 26, 235, "Science");
		bookRepository.save(book1);

		Book book2 = new Book("Sibusiso L. Mbanjwa", "co.Mbanjwa", 43255, 36, 353, "Law");
		bookRepository.save(book2);

		Book book3 = new Book("John Luke", "Inter-Pub", 54365, 12, 321, "Philosophy");
		bookRepository.save(book3);

		Book book4 = new Book("Albert Hormic", "News", 2345, 22, 235, "Geology");
		bookRepository.save(book4);

		Book book5 = new Book("Alan Walker", "Kevin Better", 13565, 33, 200, "Maths");
		bookRepository.save(book5);
	}

}
