package com.seed.library.utility;


import com.seed.library.Book;

import java.util.Comparator;

public class ComapareBooksByPrice implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return Double.compare(b1.getPrice(), b2.getPrice());
    }
}
