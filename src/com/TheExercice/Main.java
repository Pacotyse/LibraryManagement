package com.TheExercice;

public class Main {
    public static void main(String[] args) {
        BookManager.addOne("Jujutsu Kaisen", "Sukuna awakening", 1, 2018, "Gege Akutami");
        BookManager.viewAll();
        BookManager.deleteOne("Juj208");
        BookManager.viewAll();
    }
}