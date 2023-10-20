package com.TheExercice;

/**
 * This class represents a book with a title, author, and release date.
 */
public class Book {

    private String title;
    private String author;
    private int releaseDate;

    /**
     * Constructs a new Book object with the specified title, author, and release date.
     *
     * @param title       The title of the book.
     * @param author      The author of the book.
     * @param releaseDate The release date of the book.
     */
    public Book(String title, String author, int releaseDate) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    /**
     * Returns a string representation of the book in the format "Title by Author of Release Date".
     *
     * @return The string representation of the book.
     */
    @Override
    public String toString() {
        return title + " par " + author + " de " + releaseDate;
    }

    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }
}

