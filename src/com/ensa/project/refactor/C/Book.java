package com.ensa.project.refactor.C;

class Book {
    private String title;
    private boolean checkedOut;

    public void checkout() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println("Book checked out: " + title);
        } else {
            System.out.println("Book is already checked out.");
        }
    }

    public void returnBook() {
        if (checkedOut) {
            checkedOut = false;
            // Add the book back to the library's collection.
        } else {
            System.out.println("This book was not checked out.");
        }
    }
}
