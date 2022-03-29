package ru.skypro;
class Author {
    String name;
    String surname;

    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String GetNameAuthor() {
        return name;
    }
    public String GetSurnameAuthor() {
        return surname;
    }

    }

public class Book {
    String author;
    static String bookName;
    static int publicationYear;
    static String surname;
    static String name;
    String thisBookName;

    public Book(String bookName, int publicationYear, String author) {
        this.author = author;
        this.bookName = bookName;
        this.publicationYear = publicationYear;
        this.surname = surname;
        this.name = name;
    }

    public String GetBookName() {
        return bookName;
    }

    public int GetPublicationYear() {
        return publicationYear;

    }

    public void setpublicationYear(int publicationYear) { // сеттер года публикации
        this.publicationYear = publicationYear;

    }

}





