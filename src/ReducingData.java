import java.util.Arrays;
import java.util.List;

public class ReducingData {
        public static void main(String[] args)
        {
            List<Integer> numbers = Arrays.asList(12,10,99,2,10,96);
            int sum = numbers.stream()
                    .reduce(0, (firstElement, secondElement) -> firstElement + secondElement);
            System.out.println(sum);
        }
    }

