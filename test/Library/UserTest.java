package Library;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User customer = new Customer("Tim", "Mothy");
    User admin = new Librarian("John", "Paul");

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void userShouldHaveFirstNameAndLast(){

        assertEquals("Mothy", customer.getLastName());
        assertEquals("Paul", admin.getLastName());
        assertEquals("Tim", customer.getFirstName());
        assertEquals("John", admin.getFirstName());
    }
}