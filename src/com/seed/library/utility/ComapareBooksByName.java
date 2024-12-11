package com.seed.library.utility;

import com.seed.library.Book;
import java.util.Comparator;


public class ComapareBooksByName implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getName().compareTo(b2.getName());
    }
}