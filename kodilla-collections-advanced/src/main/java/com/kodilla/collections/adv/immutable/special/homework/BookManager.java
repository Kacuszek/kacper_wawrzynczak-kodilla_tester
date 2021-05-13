package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {
    public static Set<Book> bookManager = new HashSet<>();
    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        bookManager.add(new Book("Pan Tadeusz", "Adam Mickiewicz"));
        bookManager.add(new Book("Lalka", "Bolesław Prus"));
        return book;
    }
}
