package Library;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardDetailsTest {

    CardDetails cardDetails;
    Customer customer;
    @BeforeEach
    void setUp() {
        customer = new Customer("Emmanuel",  "Maker");
        cardDetails = new CardDetails("Emmanuel Maker", "1124 8894 9382 5423", LocalDate.now());
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void customerProvidesName(){
        customer.setCustomerCardDetails("Emmanuel Maker", "1124 8894 9382 5423", LocalDate.now());
        assertEquals(1, customer.getCustomerCardDetails().size());
    }
}