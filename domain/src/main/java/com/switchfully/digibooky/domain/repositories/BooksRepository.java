package com.switchfully.digibooky.domain.repositories;

import com.switchfully.digibooky.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class BooksRepository {
    private final ConcurrentHashMap<String, Book> booksById = new ConcurrentHashMap();

    @Autowired
    public BooksRepository(Collection<Book> books) {
        if (books != null) {
            books.stream()
                    .filter(book -> book != null)
                    .forEach(book -> booksById.put(book.getId(), book));
        }
    }


}