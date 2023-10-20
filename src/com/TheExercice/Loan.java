package com.TheExercice;

import java.util.Calendar;
import java.util.Date;

public class Loan {
    private Book book;
    private User user;
    Calendar calendar = Calendar.getInstance();
    private Date borrowingDate;
    private static final int LOAN_DURATION_DAY = 14;
    private Date returnDate;

    public Loan(Book book, User user) {
            this.book = book;
            this.user = user;

        if (!user.borrowedBook(book)) {
            borrowBook();

            borrowingDate = calendar.getTime();
            calendar.add(Calendar.DAY_OF_MONTH, LOAN_DURATION_DAY);
            returnDate = calendar.getTime();
        } else {
            System.out.println(this.user + " possède déjà " + this.book.getTitle());
        }
    }

    private void borrowBook() {
        user.borrowBook(book);
    }

    public void returnBook() {
        user.giveBackBook(book);
    }

    public String toString() {
        return book.getTitle() + " -> " + user.toString();
    }
}
