package exercise;

import models.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Six {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1, "Debit", 2000));

        transactions.stream().map(data -> data.getDate() + " " + data.getTransactionType()).forEach(System.out::println);
    }
}
