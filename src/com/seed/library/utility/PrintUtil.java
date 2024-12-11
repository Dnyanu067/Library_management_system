package com.seed.library.utility;


import java.util.List;

import com.seed.library.Book;

public class PrintUtil {
    public static void printRecords(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}