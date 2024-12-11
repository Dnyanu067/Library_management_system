package com.seed.library.utility;


import java.util.ArrayList;

import java.util.List;

import com.seed.library.Book;

public class StoreUtil {
    private List<Book> books;

    // Constructor to initialize the list
    public StoreUtil() {
        books = new ArrayList<>();
    }

    // Method to add a record
    public void addRecord(Book book) {
        books.add(book);
    }

    // Method to get all records
    public List<Book> getRecords() {
        return books;
    }

    // Method to get the number of records
    public int getNoOfRecords() {
        return books.size();
    }
}