package Task4.enums;

public enum Genre {
    FANTASY("Fantasy"),
    ADVENTURE("Adventure"),
    HORROR("Horror"),
    LEGEND("Legend"),
    FAIRYTALE("Fairytale"),
    SCIENCE("Science"),
    PERIODICAL("Periodical");

    private String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return genre;
    }
}
