public class Cards {
    int cardId;
    String cardHolderName;
    String cardType;
    String bankName;
    double balance;

    Cards(int cardId, String cardHolderName, String cardType, String bankName, double balance) {
        this.cardId = cardId;
        this.cardHolderName = cardHolderName;
        this.cardType = cardType;
        this.bankName = bankName;
        this.balance = balance;
    }
}
