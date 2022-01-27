package ru.spypro.homework.lesson09;

public class Book {
    String titleBook;
    int yearBook;
    Author author;

    public Book(String titleBook, int yearBook, Author author) {
        this.titleBook = titleBook;
        this.yearBook = yearBook;
        this.author = author;
    }


    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    public int getYearBook() {
        return yearBook;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

