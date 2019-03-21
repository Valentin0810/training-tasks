package Task4.entity;

import Task4.enums.Genre;

public class Book extends Issue {
    String author;
    String publishingHouse;

    public Book(String name, String author, Genre genre, int pages, String publishingHouse) {
        super(genre, name, pages);
        this.author = author;
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {
        return "Book{" + genre + "," + author + "," + name + "," + pages + "," + publishingHouse +"}";
    }
}