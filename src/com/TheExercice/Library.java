package com.TheExercice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private static List<Book> books = new ArrayList<>();
    private static List<User> users = new ArrayList<>();
    private static List<Loan> loans = new ArrayList<>();

    public static void viewBook() {
        books.stream().forEach(System.out::println);
    }

    public static void addBook(String title, String author, int releaseDate) {
        Book book = new Book(title, author, releaseDate);
        books.add(book);
    }

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
