package Library;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
Book book;
    @BeforeEach
    void setUp() {
        book = new Book();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testBookHasTitle(){
        book.setTitle("I Burn for you");
        assertNotNull(book.getTitle());
        assertEquals("I Burn for you", book.getTitle());
    }

    @Test
    void testBookHasAuthor(){
        Author  author = new Author("Onyi", new Book());
        book.setAuthor(author);
        assertNotNull(book.getAuthor());
        assertEquals("Onyi", book.getAuthor().getFirstName());
    }
}