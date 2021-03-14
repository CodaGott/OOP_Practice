package Library;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("Ayo", "Tunde");
    }

    @AfterEach
    void tearDown() {
    }

   @Test
    void customerCanMakeRequest(){
        customer.makeRequest("BookTitle", "Author Name");
        customer.makeRequest("BookTitle", "Author Name", LocalDate.now());
        assertEquals(2, customer.getRequest().size());
   }
}