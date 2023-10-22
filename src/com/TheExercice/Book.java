package com.TheExercice;

/**
 * This class represents a book with a title, author, release date, and volume.
 */
public class Book implements ReferenceGenerator {
    private final String reference;
    private final String mainTitle;
    private final String subTitle;
    private final int volume;
    private final int releaseDate;
    private final String author;

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
        this.reference = generateRef();
    }

    /**
     * Generates a reference code for the book based on its main title and volume.
     * The reference code is a combination of the first three characters of the main title
     * and the volume number.
     *
     * @return The generated reference code.
     */
    @Override
    public String generateRef() {
        return mainTitle.substring(0, 3) + volume;
    }

    /**
     * Returns a string representation of the book in the format "#Reference | Title - Subtitle by Author (Release Date)".
     *
     * @return The string representation of the book.
     */
    @Override
    public String toString() {
        return "#" + reference + " | " + mainTitle + " - " + (subTitle != null ? subTitle + " " : "") +
                "by " + author + " (" + releaseDate + ")";
    }

    /**
     * Gets the reference code for the book.
     *
     * @return The reference code.
     */
    public String getReference() {
        return reference;
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
