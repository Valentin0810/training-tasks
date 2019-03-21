package Task4.comparator;

import Task4.entity.Issue;

import java.util.Comparator;

public class GenreNameComparator implements Comparator<Issue> {

    @Override
    public int compare(Issue issue1, Issue issue2) {
        return issue1.getGenre().compareTo(issue2.getGenre());
    }
}