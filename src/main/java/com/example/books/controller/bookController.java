package com.example.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.books.entity.Book;
import com.example.books.service.serviceInterface;

@Controller
public class bookController {
	// @SuppressWarnings("unused")
	@Autowired
	private serviceInterface serviceInterface;

	@GetMapping("/books")
	public String bookList(Model model) {
		List<Book> books = serviceInterface.getAllBooks();
		model.addAttribute("books", books);
		// model.addAttribute(serviceInterface.bookList());
		return ("BookView");
	}

	@GetMapping("/books/new")
	public String newBook(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return ("New");
	}

	@GetMapping("/book/edit/{id}")
	public String editBook(@PathVariable Long id, Model model) {
		model.addAttribute("book", serviceInterface.getById(id));
		return "Edit";
	}

	//@GetMapping("/book/delete/{id}")
	//public String deleteById(@PathVariable Long id) {
	//	serviceInterface.deleteById(id);
	//	return ("redirect:books");
	//}

	@PostMapping("/bookLibrary")
	public String saveBook(@ModelAttribute() Book book) {
		serviceInterface.saveBook(book);
		return ("redirect:/books");
	}

	@PostMapping("/books/{id}")
	public String update(@PathVariable Long id,
			@ModelAttribute() Book book) {
		Book existingBook = serviceInterface.getById(id);
		existingBook.setAuthor(book.getAuthor());
		existingBook.setCopies(book.getCopies());
		existingBook.setId(book.getId());
		existingBook.setIsbn(book.getIsbn());
		existingBook.setPages(book.getPages());
		existingBook.setPublisher(book.getPublisher());
		serviceInterface.editBook(existingBook);
		return ("redirect:/books");
	}

	@GetMapping("/")
	public String runTest() {
		return "home";
	}

}
