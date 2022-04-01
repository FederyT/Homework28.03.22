package ru.skypro;

import java.util.Objects;

class Author {

    String name;
    String surname;
    private static Object Author;

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

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}


