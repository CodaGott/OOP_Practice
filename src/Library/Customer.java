package Library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
    List<BookRequest> bookRequests;
    List<CardDetails> customerCards;


    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
        bookRequests = new ArrayList<>();
        customerCards = new ArrayList<>();
        System.out.println("Creating Customer class");
    }

    public void makeRequest(String bookTitle, String authorName){
        BookRequest bookRequest = new BookRequest(bookTitle, authorName);
        bookRequests.add(bookRequest);
    }
    public void makeRequest(String bookTitle, String authorName, LocalDate publishedDate){
        BookRequest bookRequest = new BookRequest(bookTitle, authorName, publishedDate);
        bookRequests.add(bookRequest);
    }

    public List<BookRequest> getRequest(){
        return bookRequests;
    }

    public void setCustomerCardDetails(String cardName, String cardNumber, LocalDate expiringDate){
        CardDetails customerCard = new CardDetails(cardName, cardNumber, expiringDate);
        customerCards.add(customerCard);
    }

    public List<CardDetails> getCustomerCardDetails(){
        return customerCards;
    }

}
