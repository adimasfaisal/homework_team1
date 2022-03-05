package exercise;
import models.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Four {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1,"Debit", 1000));
        transactions.add(new Transaction(2,"Kredit", 200));
        transactions.add(new Transaction(3,"Debit", 1000));

        transactions.stream().map(data -> data.getId()).forEach(System.out::println);
    }
}
