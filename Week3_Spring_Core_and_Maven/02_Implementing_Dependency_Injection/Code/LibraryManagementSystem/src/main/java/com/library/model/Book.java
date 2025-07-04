package com.library.model;


public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Book Title: " + title);
    }
}
