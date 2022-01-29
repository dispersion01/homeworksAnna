package ru.spypro.homework.lesson09;

public class Main {


    public static void main(String[] args) {
        // write your code here

        Author newAuthorOne = new Author("Ivan", "Petrov");
        Book bookOne = new Book("First Book", 2020, newAuthorOne);
        Author newAuthorTwo = new Author("Petr", "Ivanov");
        Book bookTwo = new Book("First Book", 2020, newAuthorTwo);
        bookOne.setYearBook(1901);
    }
}
