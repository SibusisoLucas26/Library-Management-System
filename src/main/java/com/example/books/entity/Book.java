package com.example.books.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "Books")
public class Book {
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String author;
	private String publisher;
	private int isbn;
	private int copies;
	private int pages;
	private String subject;

	// Geters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// Constructors
	public Book(Long id, String author, String publisher, int isbn, int copies, int pages, String subject) {
		this.id = id;
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
		this.copies = copies;
		this.pages = pages;
		this.subject = subject;
	}

	public Book(String author, String publisher, int isbn, int copies, int pages, String subject) {
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
		this.copies = copies;
		this.pages = pages;
		this.subject = subject;
	}

	public Book() {
	}

	// To String
	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", publisher=" + publisher + ", isbn=" + isbn + ", copies="
				+ copies + ", pages=" + pages + ", subject=" + subject + "]";
	}

}
