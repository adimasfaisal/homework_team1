package exercise;
import java.util.Optional;

public class Eight {
    public static void main(String[] args) {
        Optional <String> name = Optional.ofNullable(getName());
        System.out.println(name.orElse("nama"));
    }

    private static String getName() {
        return null;
    }
}
