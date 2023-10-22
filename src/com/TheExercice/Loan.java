package com.TheExercice;

import java.util.Calendar;
import java.util.Date;

/**
 * This class represents a loan of a book to a user in a library.
 */
public class Loan {
    private Book book;
    private User user;
    Calendar calendar = Calendar.getInstance();
    private Date borrowingDate;
    private static final int LOAN_DURATION_DAY = 14;
    private Date returnDate;

    /**
     * Constructs a new Loan object for the specified book and user.
     *
     * @param book The book to be loaned.
     * @param user The user to whom the book is loaned.
     */
    public Loan(Book book, User user) {
        this.book = book;
        this.user = user;

        borrowBook();

        borrowingDate = calendar.getTime();
        calendar.add(Calendar.DAY_OF_MONTH, LOAN_DURATION_DAY);
        returnDate = calendar.getTime();
    }

    /**
     * Allows the user to borrow the book associated with this loan.
     */
    private void borrowBook() {
        user.borrowBook(book);
    }

    /**
     * Allows the user to return the book to the library.
     */
    public void returnBook() {
        user.giveBackBook(book);
    }

    /**
     * Returns a string representation of the loan in the format "Book Title -> User".
     *
     * @return The string representation of the loan.
     */
    @Override
    public String toString() {
        return book.getMainTitle() + " -> " + user.toString();
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }
}
