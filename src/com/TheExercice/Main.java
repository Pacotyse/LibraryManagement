package com.TheExercice;

public class Main {
    public static void main(String[] args) {
        Library.addUser("Enzo");
        Library.addBook("Jujutsu Kaisen", "Sukuna awakening", 1, 2018, "Gege Akutami");
        Library.addLoan("Jujutsu Kaisen", "Enzo#1");
        Library.viewLoans();
        Library.deleteLoan("Jujutsu Kaisen");
        Library.deleteLoan("Jujutsu Kaisen");
        Library.viewLoans();
    }
}