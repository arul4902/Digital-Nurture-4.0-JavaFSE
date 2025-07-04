package com.example.library;

public class BookService {
    private BookRepository bookRepository;

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        String title = bookRepository.getBookTitle();
        System.out.println("Book Title: " + title);
    }
}
