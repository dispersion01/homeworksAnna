package ru.spypro.homework.lesson09;

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


    public boolean equals(Object other) {


        Author authorOne = (Author) other;
        if (this.getLastnameAuthor() != ((Author) other).lastnameAuthor) {
            return false;
        }

        return this.lastnameAuthor.equals(authorOne.lastnameAuthor);
    }



    @Override
    public int hashCode() {

        return Object.hash(lastnameAuthor);
    }

}

