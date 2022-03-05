package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {
    private String transactionType;
    private int amount;
    private int id;
    private LocalDate date;
    private LocalTime time;

    public Transaction(int id, String transactionType, int amount) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.id = id;
        this.date = LocalDate.now();
        this.time = LocalTime.now();
    }

    public Transaction(String transactionType, int amount, int id, LocalDate date, LocalTime time) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.id = id;
        this.date = date;
        this.time = time;
    }

    public int getId() {return id;}

    public int getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getDate() {
        return date.toString();
    }

    public String getTime() {
        return time.toString();
    }
}
