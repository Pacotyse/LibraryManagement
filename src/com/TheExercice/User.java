package com.TheExercice;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a user who can borrow and return books from a library.
 */
public class User {
    private String name;
    private static int registeredNumber = 1;


    private int id;
    private List<Book> books;

    /**
     * Constructs a new User object with the specified name.
     *
     * @param name The name of the user.
     */
    public User(String name) {
        this.name = name;
        this.id = registeredNumber++;
        this.books = new ArrayList<>();
    }

    /**
     * Returns a string representation of the user in the format "Name#ID".
     *
     * @return The string representation of the user.
     */
    @Override
    public String toString() {
        return name + "#" + id;
    }

    /**
     * Allows the user to borrow a book.
     *
     * @param book The book to borrow.
     */
    public void borrowBook(Book book) {
        books.add(book);
    }

    /**
     * Checks if the user has borrowed a specific book.
     *
     * @param book The book to check for.
     * @return True if the user has borrowed the book, false otherwise.
     */
    public boolean borrowedBook(Book book) {
        return books.contains(book);
    }

    /**
     * Allows the user to return a book to the library.
     *
     * @param book The book to return.
     */
    public void giveBackBook(Book book) {
        books.remove(book);
    }

    /**
     * Gets the name of the user.
     *
     * @return The name of the user.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the id of the user.
     *
     * @return The id of the user.
     */
    public Integer getId() {
        return id;
    }
}
