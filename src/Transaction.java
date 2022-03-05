import java.util.Date;

public class Transaction {
    private Date date;
    private String transactionType;
    private int amount;

    public Transaction(String transactionType, int amount) {
        this.date = new Date();
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }
}
