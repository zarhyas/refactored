package com.ensa.project.refactor.H;

public class Message {
    public String createMessage(String text, String author, boolean isUrgent) {
        String message = "Message: " + text;
        if (author != null) {
            message += " - Author: " + author;
        }
        if (isUrgent) {
            message += " - URGENT!";
        }
        return message;
    }
}
