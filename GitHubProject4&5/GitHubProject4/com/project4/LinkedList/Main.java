package com.project4.LinkedList;

import java.util.*;

/**
 * This class shows how to read a list of integers from the input,
 * store them in a Linked List, sort them, and then print them.
 */
public class Main {
    /**
     * The main method
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Create a LinkedList to store the integers
        LinkedList<Integer> list = new LinkedList<>();

        // Read integers from input until there is no more input
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            list.add(number);
        }

        // Close the scanner
        scanner.close();

        // Sort the list
        Collections.sort(list);

        // Print the sorted list
        for (int number : list) {
            System.out.println(number);
        }
    }
}