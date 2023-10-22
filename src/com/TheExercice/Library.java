package com.TheExercice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * This class represents a library that manages books, users, and loans.
 */
public class Library {
    private static List<Book> books = new ArrayList<>();
    private static List<User> users = new ArrayList<>();
    private static List<Loan> loans = new ArrayList<>();

    /**
     * This method can find an item in a specified ArrayList based on a given Predicate.
     *
     * @param list      The ArrayList where all data is stored.
     * @param predicate A Predicate that defines the condition for the item to be found.
     * @param <T>       The type of elements in the ArrayList and the Predicate.
     * @return The first item in the ArrayList that satisfies the given Predicate, or null if no such item is found.
     */
    public static <T> T findBy(List<T> list, Predicate<T> predicate) {
        for (T item : list) {
            if (predicate.test(item)) {
                return item;
            }
        }
        return null;
    }

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
        System.out.println(book.toString() + " a été ajouté");
    }

    /**
     * Delete a book from the library by its title.
     *
     * @param title The title of the book to delete.
     */
    public static void deleteBook(String title) {
        Book book = findBy(books, b -> b.getTitle().equals(title) );
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
     * Add a new user to the library.
     *
     * @param name The name of the user.
     */
    public static void addUser(String name) {
        User user = new User(name);
        users.add(user);
        System.out.println("L'utilisateur " + user.toString() + " a été créé");
    }

    /**
     * Delete a registered user from the library.
     *
     * @param id The id of the registered user to delete.
     */
    public static void deleteUser(String id) {
        User user = findBy(users, u -> u.toString().equals(id));
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
     * @param userId The user's id who borrow the book.
     */
    public static void addLoan(String title, String userId) {
        Book book = findBy(books, b -> b.getTitle().equals(title));
        User user = findBy(users, u -> u.toString().equals(userId));
        if (book != null && user != null) {
            if (!user.borrowedBook(book)) {
                Loan loan = new Loan(book, user);
                loans.add(loan);
            } else {
                System.out.println(user.toString() + " possède déjà " + book.getTitle());
            }
        }
    }

    /**
     * Deletes a loan based on the book's title.
     *
     * @param title The title of the book associated with the loan to delete.
     */
    public static void deleteLoan(String title) {
        Book book = findBy(books, b -> b.getTitle().equals(title));
        if (book != null) {
            Loan loan = findBy(loans, b -> b.getBook().equals(book));
            if (loan != null) {
                loan.getUser().giveBackBook(book);
                loans.remove(loan);
                System.out.println(loan.getUser().toString() + " a rendu " + book.getTitle());
            } else {
                System.out.println(book.getTitle() + " n'a pas été emprunté");
            }
        } else {
            System.out.println(title + " n'existe pas");
        }
    }
}

