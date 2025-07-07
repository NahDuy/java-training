import java.util.function.Consumer;
import java.util.function.Function;

// Dùng để thực hiện các hành động
public class ConsumerExample {
    public static void main(String[] args) {
        //Lambda
        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());
        // Method reference 
        Function<String, String> toUpper = String::toUpperCase;     
        Consumer<String> print = System.out::println;              

        // Gộp lại sử dụng:
        String input = "hello";
        printUpper.accept(input);
        print.accept(toUpper.apply(input));  // HELLO
    }
}
