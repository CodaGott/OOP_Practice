package Library;

import java.time.LocalDate;

public class CardDetails {

    private String cardName;
    private String cardNumber;
    private LocalDate expiringDate;


    public CardDetails(String cardName, String cardNumber, LocalDate expiringDate) {
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.expiringDate = expiringDate;
    }

//    public void setCardName(String cardName) {
//        this.cardName = cardName;
//    }
//
//    public void setCardNumber(String cardNumber) {
//        this.cardNumber = cardNumber;
//    }
//
//    public void setExpiringDate(LocalDate expiringDate) {
//        this.expiringDate = expiringDate;
//    }


    public String getCardName() {
        return cardName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public LocalDate getExpiringDate() {
        return expiringDate;
    }
}
