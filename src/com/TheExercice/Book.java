package com.TheExercice;

public class Book {
    private String title;
    private String author;
    private int releaseDate;
    public Book(String title, String author, int releaseDate) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return title + " par " + author + " de " + releaseDate;
    }
}
