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
        if (user.borrowedBook(book)) {
            System.out.println(book.toString() + " est déjà emprunté par " + user.toString());
        } else {
            this.book = book;
            this.user = user;
            borrowingDate = calendar.getTime();
            calendar.add(Calendar.DAY_OF_MONTH, LOAN_DURATION_DAY);
            returnDate = calendar.getTime();
            user.borrowBook(book);
        }
    }

    public String toString() {
        return book.getTitle() + " -> " + user.toString();
    }
}
