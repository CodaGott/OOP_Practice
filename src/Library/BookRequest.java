package Library;

import java.time.LocalDate;

public class BookRequest {
    private  LocalDate publishedDate;
    private String bookTitle;
    private String authorName;
    private boolean status;

    public BookRequest(String bookTitle, String authorName) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.status = false;
    }

    public BookRequest(String bookTitle, String authorName, LocalDate publishedDate){
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publishedDate = publishedDate;
        this.status = false;
    }

}
