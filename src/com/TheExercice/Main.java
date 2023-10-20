package com.TheExercice;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("2001 l'Odyssey de l'espace", "Arthur Clark", 1981);
        User user = new User("Enzo");
        Loan loan = new Loan(book, user);
        Loan loan2 = new Loan(book, user);
    }
}