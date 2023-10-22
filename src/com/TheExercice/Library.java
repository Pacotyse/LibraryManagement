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
     * Find a registered book to the library.
     *
     * @param title The title of the registered book to find.
     * @return book Return the book object found.
     */
    public static Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
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
        Book book = findBook(title);
        if (book != null) {
            books.remove(book);
            System.out.println("Le livre " + book + " a été supprimé");
        } else {
            System.out.println("Aucun livre ne correspond à : " + title);
        }
    }

    /**
     * Display the list of users registered in the library.
     */
    public static void viewUsers() {
        users.forEach(System.out::println);
    }

    /**
     * Find a registered user to the library.
     *
     * @param id The id of the registered user to find.
     * @return user Return the user object found.
     */
    public static User findUser(String id) {
        for (User user : users) {
            if (user.toString().equals(id)) {
                return user;
            }
        }
        return null;
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
        User user = findUser(id);
        if (user != null) {
            users.remove(user);
            System.out.println("L'utilisateur " + user + " a été supprimé");
        } else {
            System.out.println("Aucun utilisateur ne correspond à : " + id);
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

