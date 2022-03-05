package exercise;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Two {
    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();
        emails.add("Slamet@gmail.com");
        emails.add("Abdul@live.com");

        List<String> names = emails.stream()
                .map(Two::getNameFromEmail) // email -> getNameFromEmail(email)
                .map(String::toLowerCase) // name -> name.toLowerCase()
                .collect(Collectors.toList());

        System.out.println(names);
    }

    public static String getNameFromEmail(String email) {
        return email.substring(0, email.indexOf("@"));
    }
}
