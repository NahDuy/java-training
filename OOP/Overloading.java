class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    // Overloading: khác tham số
    double add(double a, double b) {
        return a + b;
    }

    // Overloading: khác số tham số
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3)); // Gọi add(int, int)
        System.out.println(calc.add(2.5, 3.5)); // Gọi add(double, double)
        System.out.println(calc.add(1, 2, 3)); // Gọi add(int, int, int)
    }

}
