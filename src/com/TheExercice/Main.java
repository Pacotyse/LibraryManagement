package com.TheExercice;

public class Main {
    public static void main(String[] args) {
        Library.addUser("Enzo");
        Library.deleteUser("Enzo#1");
        Library.addBook("Jujutsu Kaisen", "Gege Akutami", 2018);
        Library.deleteBook("Jujutsu Kaisen");
    }
}