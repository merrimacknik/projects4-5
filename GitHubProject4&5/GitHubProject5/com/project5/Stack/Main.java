package com.project5.Stack;

import java.util.*;

/**
 * Main class that reads a list of integers from the input,
 * stores them in a Stack, sorts them, and then prints them.
 * 
 * A scanner is used to read integers from the input.
 * The integers are stored in a Stack.
 * The Stack is sorted using the Collections.sort method.
 * The sorted Stack is then reversed and printed.
 * It needs to be reversed because a Stack is a last-in, first-out (LIFO) data structure.
 * The largest element is at the top of the Stack after sorting, so we need to reverse the order to print the elements in ascending order.
 */
public class Main {
    /**
     * The main method.
     * 
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        /**
         * Stack to store the integers.
         * It is initially empty and is populated with integers read from the input.
         */
        Stack<Integer> stack = new Stack<>();

        // Read integers from input until there is no more input
        while (scanner.hasNextInt()) {
            /**
             * The next integer read from the input.
             * It is added to the stack.
             */
            int number = scanner.nextInt();
            stack.push(number);
        }

        // Close the scanner
        scanner.close();

        /**
         * Sort the stack.
         * After this operation, the stack's elements are in ascending order,
         * with the largest element at the top of the stack.
         */
        Collections.sort(stack);

        /**
         * Create a new stack to reverse the order.
         * This stack will have the smallest element at the top.
         */
        Stack<Integer> reversedStack = new Stack<>();
        while (!stack.isEmpty()) {
            /**
             * Pop each element from the original stack and push it onto the reversed stack.
             * This reverses the order of the elements.
             */
            reversedStack.push(stack.pop());
        }

        /**
         * Print the sorted stack.
         * The elements are popped from the reversed stack and printed,
         * resulting in output from smallest to largest.
         */
        while (!reversedStack.isEmpty()) {
            System.out.println(reversedStack.pop());
        }
    }
}