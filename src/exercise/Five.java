package exercise;

import models.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Five {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1,"Debit", 1000));
        transactions.add(new Transaction(2,"Kredit", 200));
        transactions.add(new Transaction(3,"Debit", 1000));

        Integer total = transactions.stream().filter(data -> data.getTransactionType() == "Debit")
                .map(data -> data.getAmount()).reduce(0, Integer::sum);

        System.out.println(total);
    }
}
