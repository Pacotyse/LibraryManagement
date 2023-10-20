package com.TheExercice;

public class Main {
    public static void main(String[] args) {
        Library.addBook("2001 l'Odyssey de l'espace", "Arthur Clark", 1981);
        Library.addBook("Jujutsu Kaisen", "Gege Akutani", 2018);
        Library.deleteBook("Jujutsu Kaisen");
        Library.viewBook();
    }
}