package com.ensa.project.refactor.H;

public class Message {

    private String text;
    private String author;
    private boolean isUrgent;

    private Message(Builder builder) {
        this.text = builder.text;
        this.author = builder.author;
        this.isUrgent = builder.isUrgent;
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder("Message: ").append(text);
        if (author != null && !author.isEmpty()) {
            message.append(" - Author: ").append(author);
        }
        if (isUrgent) {
            message.append(" - URGENT!");
        }
        return message.toString();
    }

    public static class Builder {

        private final String text;  // required
        private String author;      // optional
        private boolean isUrgent;   // optional

        public Builder(String text) {
            this.text = text;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder isUrgent(boolean isUrgent) {
            this.isUrgent = isUrgent;
            return this;
        }

        public Message build() {
            return new Message(this);
        }
    }

    public static void main(String[] args) {
        Message message = new Message.Builder("Hello World")
                .author(null)
                .isUrgent(true)
                .build();
        System.out.println(message); // Message: Hello World - URGENT!
    }
}

