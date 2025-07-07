import java.util.function.Predicate;


// Dùng để kiểm tra điều kiện, trả về boolean
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> isNotEmpty = s -> !s.isEmpty();

        System.out.println(isNotEmpty.test("Hello")); // true
        System.out.println(isNotEmpty.test(""));      // false
    }
}
