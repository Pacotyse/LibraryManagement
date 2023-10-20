package com.TheExercice;

public class Loan {
    public Loan(Book book, User user) {
        if (user.borrowedBook(book))
            System.out.println(book.toString() + " est déjà emprunté par " + user.toString());
        else
            user.borrowBook(book);
    }
}
