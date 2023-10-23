package com.TheExercice;

public class Main {
    public static void main(String[] args) {
        BookManager.addOne("Jujutsu Kaisen", "Sukuna awakening", 1, 2018, "Gege Akutami");
        BookManager.addOne("Harry Potter", "L'école des sorciers", 1, 2000, "JK Rowling");

        UserManager.addOne("Enzo", "Tison", 1998);
        LoanManager.addOne("Juj2018", "ETison1998", 10);
        LoanManager.addOne("Har2000", "ETison1998", 10);

        LoanManager.viewAll();
    }
}