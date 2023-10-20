package com.TheExercice;

public class Loan {
    public Loan(Book book, User user) {
        user.borrowBook(book);
    }
}
