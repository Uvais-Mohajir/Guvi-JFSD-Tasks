package Task3;

import java.util.*;

public class Library {
    private Book[] books;
    private int count;

    // Constructor
    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    // Method to add a book
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to remove a book by ID
    public void removeBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                // Shift books to fill the gap
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                System.out.println("Book removed successfully!");
                return;
            }
        }
        System.out.println("Book not found with ID: " + bookID);
    }

    // Method to search a book by ID
    public Book searchBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                return books[i];
            }
        }
        return null;
    }

    // Method to display all books
    public void displayBooks() {
        if (count == 0) {
            System.out.println("Library is empty.");
        } else {
            System.out.println("List of Books in Library:");
            for (int i = 0; i < count; i++) {
                books[i].displayBook();
            }
        }
    }
}

