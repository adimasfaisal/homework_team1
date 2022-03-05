import java.util.Date;

public class Transaction {
    //private Date date;
    private String transactionType;
    private int amount;
    private int id;

    public Transaction(int id, String transactionType, int amount) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.id = id;
    }

    public int getId() {return id;}
//    public Date getDate() {
//        return date;
//    }

    public int getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }
}
