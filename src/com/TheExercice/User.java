package com.TheExercice;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a user who can borrow and return books from a library.
 */
public class User implements ReferenceGenerator {
    private final String reference;
    private final String firstName;
    private final String lastName;
    private final int birthYear;
    private final List<Book> books;

    /**
     * Constructs a new User object with the specified first name, last name, and birth year.
     *
     * @param firstName The first name of the user.
     * @param lastName  The last name of the user.
     * @param birthYear The birth year of the user.
     */
    public User(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.books = new ArrayList<>();
        this.reference = generateRef();
    }

    /**
     * Generates a reference for the user based on their first name, last name, and birth year.
     *
     * @return The generated reference.
     */
    @Override
    public String generateRef() {
        return firstName.charAt(0) + lastName + birthYear;
    }

    /**
     * Returns a string representation of the user in the format "FirstName LastName".
     *
     * @return The string representation of the user.
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + " as " + reference;
    }

    /**
     * Gets the reference ID of the user.
     *
     * @return The reference ID.
     */
    public String getReference() {
        return reference;
    }

    /**
     * Gets the first name of the user.
     *
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the last name of the user.
     *
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the birth year of the user.
     *
     * @return The birth year.
     */
    public int getBirthYear() {
        return birthYear;
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
    public void returnBook(Book book) {
        books.remove(book);
    }
}
