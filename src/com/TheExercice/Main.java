package com.TheExercice;

public class Main {
    public static void main(String[] args) {
        var user = new User("Enzo");
        Library.addBook("Jujutsu Kaisen", "Gege Akutami", 2018);
        Library.addLoan("Jujutsu Kaisen", user);
        Library.viewLoans();
    }
}