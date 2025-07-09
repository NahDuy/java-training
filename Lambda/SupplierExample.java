import java.util.function.Supplier;


// Không nhận vào giá trị, trả về 1 giá trị kiểu T, dùng để cung cấp giá trị khi cần
public class SupplierExample {
    public static void main(String[] args) {
        // Lambda 
        Supplier<Double> randomSupplierA = () -> Math.random();
        // Method reference
        Supplier<Double> randomSupplierB = Math::random;

        System.out.println(randomSupplierA.get()); // Ví dụ: 0.7263...
        System.out.println(randomSupplierB.get());
    }
}
