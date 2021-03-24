package com.switchfully.digibooky.domain;

import java.util.UUID;

public class Book {
    private final String title;
    private final String ISBN;
    private final Author author;
    private final String id;


    public Book(String title, String ISBN, Author author) {
        this.id= UUID.randomUUID().toString();
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public Author getAuthor() {
        return author;
    }

    public String getId() {
        return id;
    }
}
