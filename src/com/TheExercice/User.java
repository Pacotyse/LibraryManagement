package com.TheExercice;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;

    private static int registeredNumber = 1;

    private int id;
    private List<Book> books;

    public User(String name) {
        this.name = name;
        this.id = registeredNumber++;
        this.books = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        books.add(book);
        System.out.println(book.toString() + " a été emprunté par " + name);
    }

    public void giveBackBook(Book book) {
        books.remove(book);
        System.out.println(book.toString() + " a été rendu par " + name);
    }
}
