package exercise;

// 1. Using create an Interface and using a Lambda expression
public class One {
    public static void main(String[] args) {
        greet("Morning", f -> System.out.println(f));
        greet("Afternoon", f -> System.out.println(f));
        greet("Night", f -> System.out.println(f));
        greet("Day", f -> System.out.println(f));
    }

    private static void greet(String day, GreetingInterface greeting) {
        greeting.sayGood(day);
    }
}

interface GreetingInterface {
    void sayGood(String day);
}