package Task4.Solution5;
import java.util.*;

public class IntStack {
    // Stack to store integers
    Stack<Integer> stack = new Stack<>();

    // Method to push element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println(element + " pushed onto the stack.");
    }

    // Method to pop element from the stack
    public void popElement() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
        } else {
            int removed = stack.pop();
            System.out.println(removed + " popped from the stack.");
        }
    }

    // Method to check if the stack is empty
    public void checkEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is NOT empty. Elements: " + stack.size());
        }
    }

    // Method to display all elements
    public void displayStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. No elements to display.");
        } else {
            System.out.println("Stack elements: " + stack);
        }
    }
}