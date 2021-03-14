package Library;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibrarianTest {

    Librarian librarian;

    @BeforeEach
    void setUp() {
        librarian = new Librarian("Book Manager", "Library");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void librarianHasName(){

    }
}