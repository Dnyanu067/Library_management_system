package com.seed.library;


import java.util.HashSet;


import java.util.Set;

import com.seed.library.utility.PrintUtil;
import com.seed.library.utility.SortUtil;
import com.seed.library.utility.StoreUtil;

public class LibraryMain {
    public static void main(String[] args) {
        // Create Book objects
        Set<String> authors1 = new HashSet<>();
        authors1.add("John zelle");
        authors1.add("Guido");

        Set<String> authors2 = new HashSet<>();
        authors2.add("andrew");

        Book book1 = new Book(1, "python Programming", authors1, 500.0);
        Book book2 = new Book(2, "Operating System", authors2, 600.0);

        // Create StoreUtil object
        StoreUtil store = new StoreUtil();
        store.addRecord(book1);
        store.addRecord(book2);

        // Print all records
        System.out.println("All Books:");
        PrintUtil.printRecords(store.getRecords());

        // Sort by name
        System.out.println("\nBooks sorted by name:");
        SortUtil.sortByName(store.getRecords());
        PrintUtil.printRecords(store.getRecords());

        // Sort by price
        System.out.println("\nBooks sorted by price:");
        SortUtil.sortByPrice(store.getRecords());
        PrintUtil.printRecords(store.getRecords());
    }
}
