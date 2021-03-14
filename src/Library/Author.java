package Library;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String firstName;
    private String lastName;
    private List<Book> books;

    public Author(String firstName, Book book) {
        this.firstName = firstName;
        books = new ArrayList<>();
        books.add(book);
    }

    public String getFirstName() {
        return firstName;
    }

    public List<Book> getBooks() {
        return books;
    }
}
