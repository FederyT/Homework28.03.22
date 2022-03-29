package ru.skypro;

import java.lang.reflect.AccessibleObject;
import java.sql.SQLOutput;
import java.util.function.ToLongBiFunction;


public class Main {

    public static void main(String[] args) {


        Book oneBook = new Book("War and Peace", 1865,"Leo Tolstoy " );
        Book twoBook = new Book("Crime And Punishment", 1866, "Fyodor Dostoevsky");
        oneBook.thisBookName = " War and Peace"; // для того, чтобы  через "sout" -
        twoBook.thisBookName = " Crime And Punishment"; // в консоль выдавалась не ссылка на название, а само название книги
        Author firstAuthor = new Author("Leo", "Tolstoy");
        Author secondAuthor = new Author("Fyodor", "Dostoevsky");
        System.out.println("oneBook = " + oneBook.thisBookName );
        System.out.println("twoBook = " + twoBook.thisBookName );
        oneBook.publicationYear = 2022; //меняем год
        System.out.println("oneBook.publicationYear = " + oneBook.publicationYear);

    }
}
