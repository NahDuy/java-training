import java.util.ArrayList;
import java.util.List;

class Animal {
}

class Dog extends Animal {
}

class Husky extends Dog {
}

public class WildCard {
    public static void main(String[] args) {
        // upper bounded
        List<? extends Number> readOnlyList = new ArrayList<Integer>();
        readOnlyList.add(1); // ❌ Compile Error
        Number n = readOnlyList.get(0); // ✅ OK
        // lowbounded
        List<? super Integer> writeOnlyList = new ArrayList<Number>();
        writeOnlyList.add(123); // ✅ OK
        Object obj = writeOnlyList.get(0); // ✅ OK nhưng là Object

        List<? extends Dog> list = new ArrayList<Husky>();
        list.add(new Dog()); // ❌ Không được
        Dog d = list.get(0); // ✅ OK

        List<? super Dog> list = new ArrayList<Animal>();
        list.add(new Dog()); // ✅ OK
        Object o = list.get(0); // ✅ nhưng là Object

    }
}
// Nếu muốn thêm vào extends, thì phải khai báo rõ kiểu dữ liệu
// Dùng generic method với type cụ thể
// Tạo list mới từ writeOnlyList với kiểu dữ liệu cụ thể
