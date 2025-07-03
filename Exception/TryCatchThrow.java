public class TryCatchThrow {
    // Phương thức tự kiểm tra và ném Exception nếu điều kiện không thỏa mãn
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be >= 18");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        // Try/Catch để bắt lỗi tự nhiên (ArithmeticException)
        try {
            int result = 10 / 0; // chia cho 0
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("[Try/Catch] Error caught: " + e.getMessage());
        }

        // Ví dụ 2: Gọi phương thức validateAge() mà không bắt lỗi
        // Sẽ gây dừng chương trình nếu không comment
        // validateAge(15);

        // Ví dụ 3: Kết hợp Try/Catch + throw
        try {
            validateAge(15); // sẽ throw lỗi
        } catch (IllegalArgumentException e) {
            System.out.println("[Try/Catch + Throw] Error caught: " + e.getMessage());
        }

        //TryWithResources là 1 cách dùng những class được implement AutoCloseable, khi đó giúp đóng tài nguyên close() khi try kết thúc mà không cần finally
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            String line = reader.readLine();
            System.out.println("First line: " + line);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
