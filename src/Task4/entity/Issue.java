package Task4.entity;

import Task4.enums.Genre;

import java.util.Collection;
import java.util.Scanner;
import java.util.Set;

public class Issue {

    Genre genre;
    String name;
    int pages;

    public Issue(Genre genre, String name, int pages) {

        this.genre = genre;
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Issue{" +
                '\'' + genre +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}