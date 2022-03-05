package exercise;

import java.util.ArrayList;
import java.util.List;

public class Three {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int i;
        for (i = 0; i<= 10; i++){
            numbers.add(i);
        }

        numbers.stream().filter(number -> number%2 == 0).forEach(System.out::println);
    }
}
