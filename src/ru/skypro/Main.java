package ru.skypro;

import java.lang.reflect.AccessibleObject;
import java.sql.SQLOutput;
import java.util.function.ToLongBiFunction;


public class Main {

    public static void main(String[] args) {
        // write your code here

        Author firstAuthor = new Author("Leo", "Tolstoy");
        Book oneBook = new Book("War and Peace", 1865, firstAuthor);
        System.out.println("oneBook = " + oneBook.GetBookName() + ", " + oneBook.GetPublicationYear() + " - " + oneBook.author.GetSurnameAuthor() + " " + oneBook.author.GetNameAuthor());
        Author secondAuthor = new Author("Fyodor", "Dostoevsky");
        Book twoBook = new Book("Crime And Punishment", 1866, secondAuthor);
        System.out.println("twoBook = " + twoBook.GetBookName() + ", " + twoBook.GetPublicationYear() + " - " + twoBook.author.GetNameAuthor() + " " + twoBook.author.GetSurnameAuthor());
        oneBook.publicationYear = 2022; //меняем год
        System.out.println("oneBook.publicationYear = " + oneBook.publicationYear);

    }

}







