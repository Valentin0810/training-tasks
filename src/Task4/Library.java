package Task4;

import Task4.dao.IssueDao;
import Task4.entity.Book;
import Task4.entity.Issue;
import Task4.entity.Journal;
import Task4.entity.Newspaper;
import Task4.enums.Genre;
import Task4.comparator.IssuePagesComparator;
import Task4.comparator.GenreNameComparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Library {
    private static ArrayList<Issue> issues = new ArrayList<>();

    public static void main(String[] args) {
        createLibrary();
    }

    private static void createLibrary() {
        issues.add(new Book("White Fung", "Jack London", Genre.ADVENTURE, 750, "ACT"));
        issues.add(new Book("It", "Stephen King", Genre.HORROR, 1136, "ACT"));
        issues.add(new Book("The Call of the Wild", "Jack London", Genre.ADVENTURE, 250, "ACT"));
        issues.add(new Journal("Cosmopolitan", Genre.PERIODICAL, 1, 2019, 98));
        issues.add(new Newspaper("New York Times", Genre.PERIODICAL, 58, 48, LocalDate.of(2019, 11, 1)));
        System.out.println(issues);
        Comparator<Issue> compar = new IssuePagesComparator().thenComparing(new GenreNameComparator());
        Collections.sort(issues, compar);
        System.out.println(issues);

        IssueDao dao = new IssueDao();
        System.out.println(dao.getBookPagesByGenre(issues));
        System.out.println(issues);
        System.out.println(dao.getIssueByPages(20, 100, issues));
    }
}