package com.TheExercice;

import java.util.Calendar;
import java.util.Date;

/**
 * This class represents a loan of a book to a user in a library.
 */
public class Loan {
    private static int referenceIndex = 1;
    private final int reference;
    private final Book book;
    private final User user;
    private Date borrowDate;
    private Date returnDate;

    /**
     * Constructs a new Loan object for the specified book and user with a specified duration.
     *
     * @param book     The book to be loaned.
     * @param user     The user to whom the book is loaned.
     * @param duration The duration of the loan in days.
     */
    public Loan(Book book, User user, int duration) {
        this.book = book;
        this.user = user;
        this.reference = generateRef();

        user.borrowBook(book);
        generateLoanDuration(duration);
    }

    /**
     * Generates the loan duration based on the specified duration in days.
     *
     * @param duration The duration of the loan in days.
     */
    public void generateLoanDuration(int duration) {
        Calendar calendar = Calendar.getInstance();
        this.borrowDate = calendar.getTime();
        calendar.add(Calendar.DAY_OF_MONTH, duration);
        this.returnDate = calendar.getTime();
    }

    /**
     * Generates a unique reference ID for the loan.
     *
     * @return The generated reference ID.
     */
    public int generateRef() {
        return referenceIndex++;
    }

    /**
     * Returns a string representation of the loan in the format "#Reference | Book Title -> User".
     *
     * @return The string representation of the loan.
     */
    @Override
    public String toString() {
        return "#" + reference + " | " + book.getReference() + " -> " + user.getReference();
    }

    /**
     * Gets the reference ID of the loan.
     *
     * @return The reference ID of the loan.
     */
    public int getReference() {
        return reference;
    }

    /**
     * Gets the book associated with the loan.
     *
     * @return The book associated with the loan.
     */
    public Book getBook() {
        return book;
    }

    /**
     * Gets the user associated with the loan.
     *
     * @return The user associated with the loan.
     */
    public User getUser() {
        return user;
    }

    /**
     * Gets the borrow date of the loan.
     *
     * @return The borrow date of the loan.
     */
    public Date getBorrowDate() {
        return borrowDate;
    }

    /**
     * Gets the return date of the loan.
     *
     * @return The return date of the loan.
     */
    public Date getReturnDate() {
        return returnDate;
    }
}
