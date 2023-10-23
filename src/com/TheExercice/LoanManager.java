package com.TheExercice;

import java.util.ArrayList;
import java.util.List;

/**
 * This class manages loans of books to users in the library.
 */
public class LoanManager implements Manager {
    private static final List<Loan> loans = new ArrayList<>();

    /**
     * Displays details of all loans in the library.
     */
    public static void viewAll() {
        // Iterate through the list of loans and print each loan's details.
        loans.forEach(u -> System.out.println(u.toString()));
    }

    /**
     * Adds a new loan to the library with the specified book reference, user reference, and duration.
     *
     * @param bookReference The reference ID of the book to be borrowed.
     * @param userReference The reference ID of the user borrowing the book.
     * @param duration      The duration of the loan in days.
     */
    public static void addOne(String bookReference, String userReference, int duration) {
        // Find the book and user based on their reference IDs.
        Book book = BookManager.findBook(bookReference);
        User user = UserManager.findUser(userReference);

        // If the book or user is not found, return without creating a loan.
        if (book == null || user == null)
            return;

        // Check if the user has already borrowed the book.
        if (user.borrowedBook(book)) {
            System.out.println(user.getReference() + " has already borrowed " + book.getReference());
            return;
        }

        // Create a new loan and print its details.
        Loan loan = new Loan(book, user, duration);

        // Add the loan to the library
        loans.add(loan);

        // Print a message to confirm the loan
        System.out.println(loan);
    }
}
