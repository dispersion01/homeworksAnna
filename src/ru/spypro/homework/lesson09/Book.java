package ru.spypro.homework.lesson09;

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

    public boolean equals(Object other) {
        Book bookOne = (Book) other;
        if (this.getTitleBook() != ((Book) other).getTitleBook()) {
            return false;
        }
        return titleBook.equals(bookOne.titleBook);
    }

    @Override
    public int hashCode() {
        return Object.hash(titleBook);
    }
}

