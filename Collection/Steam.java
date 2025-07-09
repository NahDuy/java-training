import java.util.List;
import java.util.stream.Collectors;

public class Steam {
    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Bob", "Charlie");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }
}
// reduce (Tổng hợp dữ liệu)
// collect (Thu kết quả về dạng T)