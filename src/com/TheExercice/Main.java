package com.TheExercice;

public class Main {
    public static void main(String[] args) {
        Library.addUser("Enzo");
        Library.addBook("Jujutsu Kaisen", "Gege Akutami", 2018);
        Library.addLoan("Jujutsu Kaisen", "Enzo#1");
        Library.viewLoans();
    }
}