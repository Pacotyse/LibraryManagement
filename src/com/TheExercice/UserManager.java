package com.TheExercice;

import java.util.ArrayList;
import java.util.List;

/**
 * This class manages user-related operations in the library.
 */
public class UserManager implements Manager {
    private static final List<User> users = new ArrayList<>();

    /**
     * Displays the details of all users in the library.
     */
    public static void viewAll() {
        // Iterate through the list of users and print each user's details.
        users.forEach(System.out::println);
    }

    /**
     * Finds and returns a user with the specified reference ID.
     *
     * @param reference The reference ID of the user to find.
     * @return The user with the specified reference ID, or null if no such user is found.
     */
    public static User findUser(String reference) {
        if (reference == null) {
            System.out.println("No user's reference provided.");
            return null;
        }

        // Find the user with the specified reference ID.
        User user = Manager.findBy(users, u -> u.getReference().equals(reference));

        if (user == null)
            System.out.println(reference + " not found.");

        return user;
    }


    /**
     * Adds a new user to the library with the specified details.
     *
     * @param firstName The first name of the user.
     * @param lastName  The last name of the user.
     * @param birthYear The birth year of the user.
     */
    public static void addOne(String firstName, String lastName, int birthYear) {
        // Create a new user with the provided details.
        User user = new User(firstName, lastName, birthYear);

        // Add the user to the library.
        users.add(user);

        // Print a message to confirm that the user has been added.
        System.out.println(user + " has been added.");
    }

    /**
     * Deletes a user from the library based on their reference ID.
     *
     * @param reference The reference ID of the user to delete.
     */
    public static void deleteOne(String reference) {
        // Find the user with the specified reference ID.
        User user = Manager.findBy(users, u -> u.getReference().equals(reference));

        // Check if the user exists.
        if (user == null) {
            System.out.println(reference + " does not exist.");
            return;
        }

        // Remove the user from the library.
        users.remove(user);

        // Print a message to confirm that the user has been deleted.
        System.out.println(user + " has been deleted.");
    }
}
