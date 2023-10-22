package com.TheExercice;

/**
 * This class represents a book with a title, author, release date, and volume.
 */
public class Book {
    private String mainTitle;
    private String subTitle = null;
    private int volume;
    private int releaseDate;
    private String author;

    /**
     * Constructs a new Book object with the specified mainTitle, subTitle, volume, release date, and author.
     *
     * @param mainTitle   The main title of the book.
     * @param subTitle    The subtitle of the book.
     * @param releaseDate The release date of the book.
     * @param volume      The volume number of the book.
     * @param author      The author of the book.
     */
    public Book(String mainTitle, String subTitle, int releaseDate, int volume, String author) {
        this.mainTitle = mainTitle;
        this.subTitle = subTitle;
        this.volume = volume;
        this.releaseDate = releaseDate;
        this.author = author;
    }

    /**
     * Returns a string representation of the book in the format "Title by Author of Release Date".
     *
     * @return The string representation of the book.
     */
    @Override
    public String toString() {
        return mainTitle + " by " + author + " published in " + releaseDate;
    }

    /**
     * Gets the main title of the book.
     *
     * @return The main title of the book.
     */
    public String getMainTitle() {
        return mainTitle;
    }

    /**
     * Gets the subtitle of the book.
     *
     * @return The subtitle of the book.
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * Gets the volume number of the book.
     *
     * @return The volume number of the book.
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Gets the release date of the book.
     *
     * @return The release date of the book.
     */
    public int getReleaseDate() {
        return releaseDate;
    }

    /**
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }
}
