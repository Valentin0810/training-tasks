package Task4.entity;

import Task4.enums.Genre;

public class Journal extends Issue {
    int number;
    int year;

    public Journal(String name, Genre genre, int number, int year, int pages) {
        super(genre, name, pages);
        this.year = year;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "number=" + number +
                ", year=" + year +
                ", genre=" + genre +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}