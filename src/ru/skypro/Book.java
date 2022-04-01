package ru.skypro;


import java.util.Objects;

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

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author);
    }
}