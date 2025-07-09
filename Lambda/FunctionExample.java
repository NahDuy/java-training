import java.util.function.Function;

//Dùng để chuyên dữ liệu từ kiểu này sang kiểu khác 
public class FunctionExample {
    public static void main(String[] args) {
        // Lambda
        Function<String, Integer> stringToLengthA = str -> str.length();
        // Method reference
        Function<String, Integer> stringToLengthB = String::length;

        System.out.println(stringToLengthA.apply("Hello")); // 5
        System.out.println(stringToLengthB.apply("Hello")); // 5
    }
}
