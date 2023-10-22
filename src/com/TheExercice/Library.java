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

    /**
     * Display the list of users registered in the library.
     */
    public static void viewUsers() {
        users.forEach(System.out::println);
    }

    /**
     * Add a new user to the library.
     *
     * @param name The name of the user.
     */
    public static void addUser(String name) {
        User user = new User(name);
        users.add(user);
    }

    /**
     * Delete a registered user from the library.
     *
     * @param id The id of the registered user to delete.
     */
    public static void deleteUser(String id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.toString().equals(id)) {
                iterator.remove();
                System.out.println("Utilisateur supprimé : " + user.toString());
            }
        }
    }

    /**
     * Display the list of loans registered in the library.
     */
    public static void viewLoans() {
        loans.forEach(System.out::println);
    }

    /**
     * Add a new loan to the library.
     *
     * @param title The title of book that must be borrowed.
     * @param user The user who borrow the book.
     */
    public static void addLoan(String title, User user) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equals(title)) {
            Loan loan = new Loan(book, user);
            loans.add(loan);
            }
        }
    }
}

