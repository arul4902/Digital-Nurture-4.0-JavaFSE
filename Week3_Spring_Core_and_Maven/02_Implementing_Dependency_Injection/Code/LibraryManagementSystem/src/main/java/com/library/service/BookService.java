package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBookInfo() {
        Book book = bookRepository.getBook();
        book.display();
    }
}
