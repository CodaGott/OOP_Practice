package Library;

public class Book {
    private String title;
    private Author author;


    public void setTitle(String bookTitle) {
        this.title = bookTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }
}
