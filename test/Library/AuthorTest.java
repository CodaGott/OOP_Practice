package Library;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    Author author;
    @BeforeEach
    void setUp() {
        Book book = new Book();
        book.setTitle("Passing ");
        author = new Author("Onyi", new Book());
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getFirstName(){
        assertEquals("Onyi", author.getFirstName());
    }

    @Test
    void testAuthorHasABook(){
        assertEquals(1, author.getBooks().size());
    }
}