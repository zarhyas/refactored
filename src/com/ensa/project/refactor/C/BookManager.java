package com.ensa.project.refactor.C;

import java.util.ArrayList;
import java.util.List;

class BookManager {
    private List<Book> books;

    public BookManager() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean checkoutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isCheckedOut()) {
                book.setCheckedOut(true);
                System.out.println("Book checked out: " + title);
                return true;
            }
        }
        System.out.println("Book is already checked out or not found.");
        return false;
    }

    public boolean returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isCheckedOut()) {
                book.setCheckedOut(false);
                return true;
            }
        }
        System.out.println("This book was not checked out or not found.");
        return false;
    }
}
