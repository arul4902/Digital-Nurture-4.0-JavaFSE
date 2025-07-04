package com.library;

public class BookService {
    private String libraryName;
    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(String libraryName) {
        this.libraryName = libraryName;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void showBookInfo() {
        System.out.println("Library: " + libraryName);
        System.out.println("Book: " + bookRepository.fetchBook());
    }
}
