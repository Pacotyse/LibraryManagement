package com.TheExercice;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents all interactions with the book database.
 */
public class BookManager implements Manager {
    private static final List<Book> books = new ArrayList<>();

    /**
     * Displays the details of all books in the library.
     */
    public static void viewAll() {
        // Iterate through the list of books and print each book's details.
        books.forEach(System.out::println);
    }

    /**
     * Adds a new book to the library with the specified details.
     *
     * @param mainTitle   The main title of the book.
     * @param subTitle    The subtitle of the book (can be null if not applicable).
     * @param volume      The volume of the book.
     * @param releaseDate The release date of the book.
     * @param author      The author of the book.
     */
    public static void addOne(String mainTitle, String subTitle, int volume, int releaseDate, String author) {
        // Create a new book with the provided details.
        Book book = new Book(mainTitle, subTitle, volume, releaseDate, author);

        // Add the book to the library.
        books.add(book);

        // Print a message to confirm that the book has been added.
        System.out.println(book + " has been added.");
    }

    /**
     * Deletes a book from the library based on its reference.
     *
     * @param reference The reference of the book to delete.
     */
    public static void deleteOne(String reference) {
        // Try to find the book in the library by its reference.
        Book book = Manager.findBy(books, b -> b.getReference().equals(reference));

        if (book == null) {
            // If the book is not found, print a message and return.
            System.out.println(reference + " does not exist.");
            return;
        }

        // Remove the book from the library and print a success message.
        books.remove(book);
        System.out.println(book + " has been deleted.");
    }
}
