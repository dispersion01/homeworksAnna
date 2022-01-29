package ru.spypro.homework.lesson09;

import java.util.Objects;

public class Author {
    //    объявиили переменные
    private final String nameAuthor;
    String lastnameAuthor;

    //    даем возможность создавать объекты
    public Author(String nameAuthor, String lastnameAuthor) { // конструктор
        this.nameAuthor = nameAuthor;
        this.lastnameAuthor = lastnameAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getLastnameAuthor() {
        return lastnameAuthor;
    }



    public String toString() {
        return nameAuthor + " " + lastnameAuthor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(lastnameAuthor, author.lastnameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, lastnameAuthor);
    }
}

