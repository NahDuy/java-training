import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Nguyen", "Anh", "Duy");
        // Lambda
        names.forEach(s -> System.out.println(s));
        // Method reference
        names.forEach(System.out::println);
    }
}
