package ru.spypro.homework.lesson09;

public class Author {
//    объявиили переменные
    String nameAuthor;
    String lastnameAuthor;

//    даем возможность создавать объекты
Author(String nameAuthor, String lastnameAuthor) { // конструктор
        this.nameAuthor = nameAuthor;
        this.lastnameAuthor = lastnameAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getLastnameAuthor() {
        return lastnameAuthor;
    }
}
