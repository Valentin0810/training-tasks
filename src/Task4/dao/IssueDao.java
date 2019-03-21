package Task4.dao;

import Task4.entity.Issue;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class IssueDao {
    public int getBookPagesByGenre(Collection<Issue> issues) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the genre of a book:");
        String genre = scanner.nextLine();
        int pages = 0;
        for (Issue issue : issues
                ) {
            if (issue.getGenre().toString().equalsIgnoreCase(genre)) {
                pages = pages + issue.getPages();
            }
        }
        return pages;
    }

    public List<Issue> getIssueByPages(int start, int end, Collection<Issue> issues) {
        return issues.stream().filter((issue) ->
                issue.getPages() >= start && issue.getPages() <= end).collect(Collectors.toList());
    }
}