package ru.skypro;


public class Book {
    Author author;
    static String bookName;
    static int publicationYear;

    public Book(String bookName, int publicationYear, Author author) {
        this.author = author;
        this.bookName = bookName;
        this.publicationYear = publicationYear;

    }

    public String GetBookName() {
        return bookName;
    }

    public int GetPublicationYear() {
        return publicationYear;

    }
}