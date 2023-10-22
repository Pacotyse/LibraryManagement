package com.TheExercice;

import java.util.List;
import java.util.function.Predicate;

public interface Manager {
    /**
     * This method can find an item in a specified ArrayList based on a given Predicate.
     *
     * @param list      The ArrayList where all data is stored.
     * @param predicate A Predicate that defines the condition for the item to be found.
     * @param <T>       The type of elements in the ArrayList and the Predicate.
     * @return The first item in the ArrayList that satisfies the given Predicate, or null if no such item is found.
     */
    static <T> T findBy(List<T> list, Predicate<T> predicate) {
        for (T item : list) {
            if (predicate.test(item)) {
                return item;
            }
        }
        return null;
    }
}
