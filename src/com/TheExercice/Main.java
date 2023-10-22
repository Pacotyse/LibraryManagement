package com.TheExercice;

public class Main {
    public static void main(String[] args) {
        Library.addUser("Enzo");
        Library.addUser("Louise");
        Library.deleteUser("Enzo#1");
        Library.deleteUser("Enzo#2");
        Library.viewUsers();
    }
}