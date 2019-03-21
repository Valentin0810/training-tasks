package Task4.comparator;

import Task4.entity.Issue;

import java.util.Comparator;

public class IssuePagesComparator implements Comparator<Issue> {

    @Override
    public int compare(Issue o1, Issue o2) {
        if (o1.getPages() > o2.getPages()) {
            return 1;
        } else if (o1.getPages() < o2.getPages()) {
            return -1;
        } else {
            return 0;
        }
    }
}