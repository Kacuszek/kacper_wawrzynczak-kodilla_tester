package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book a = BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");
        Book b = BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");
        Book c = BookManager.createBook("Lalka", "Bolesław Prus");
        Book d = BookManager.createBook("Lalka", "Bolesław Prus");
        System.out.println(a == b);
        System.out.println(c == d);

    }
}
