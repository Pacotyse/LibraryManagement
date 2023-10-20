package com.TheExercice;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int id;
    private List<Book> books = new ArrayList<>();

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
