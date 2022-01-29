package ru.spypro.homework.lesson09;

import java.util.Objects;

public class Book {
    private final String titleBook;
    private int yearBook;


    private final Author author;

    public Book(String titleBook, int yearBook, Author author) {
        this.titleBook = titleBook;
        this.yearBook = yearBook;
        this.author = author;
    }


/*    public void setTitleBook(String titleBook) { // не будет работать т.к. модификатор доступа private
        this.titleBook = titleBook;
    }*/

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    } //сеттер для того, чтобы потом перезаписать год

    public int getYearBook() {
        return yearBook;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitleBook() {
        return titleBook;
    }

    /*    public void setAuthor(Author author) { // не будет работать т.к. модификатор доступа private
            this.author = author;
        }*/
    public String toString() {
        return titleBook + " " + yearBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && Objects.equals(titleBook, book.titleBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, yearBook, author);
    }
}

