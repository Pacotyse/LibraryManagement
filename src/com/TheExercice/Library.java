package com.TheExercice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class represents a library that manages books, users, and loans.
 */
public class Library {
    private static List<Book> books = new ArrayList<>();
    private static List<User> users = new ArrayList<>();
    private static List<Loan> loans = new ArrayList<>();

    /**
     * Display the list of books in the library.
     */
    public static void viewBooks() {
        books.forEach(System.out::println);
    }

    /**
     * Add a new book to the library.
     *
     * @param title       The title of the book.
     * @param author      The author of the book.
     * @param releaseDate The release date of the book.
     */
    public static void addBook(String title, String author, int releaseDate) {
        Book book = new Book(title, author, releaseDate);
        books.add(book);
    }

    /**
     * Delete a book from the library by its title.
     *
     * @param title The title of the book to delete.
     */
    public static void deleteBook(String title) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equals(title)) {
                iterator.remove();
                System.out.println("Livre supprimé : " + book.toString());
            }
        }
    }
}

