package Task4.entity;

import Task4.enums.Genre;

import java.time.LocalDate;

public class Newspaper extends Issue {
    int number;
    LocalDate date;

    public Newspaper(String name, Genre genre, int number, int pages, LocalDate date) {
        super(genre, name, pages);
        this.number = number;
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "number=" + number +
                ", date=" + date +
                ", genre=" + genre +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}