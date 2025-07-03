public class Static {

    // Instance variable
    // Mỗi object có 1 bản riêng
    int instanceValue = 10;

    // Static variable
    // Mọi object dùng chung
    static int staticValue = 20;

    // Static method
    // Gọi qua tên class, không cần object
    static void staticGreet() {
        System.out.println("Hello from static method!");
    }

    // Static nested class
    // Không cần object outer để tạo
    static class StaticHelper {
        void showMessage() {
            // Không thể truy cập instanceValue trực tiếp
            // System.out.println(instanceValue); // lỗi!
            System.out.println("Hello from static nested class!");
            System.out.println("Accessing staticValue = " + staticValue);
        }
    }

    // Non-static Inner class
    // Cần object outer để tạo
    class InnerHelper {
        void showMessage() {
            // Có thể truy cập cả instance và static
            System.out.println("Hello from inner class!");
            System.out.println("Accessing instanceValue = " + instanceValue);
            System.out.println("Accessing staticValue = " + staticValue);
        }
    }

    public static void main(String[] args) {
        // Tăng static variable
        Static.staticValue++;
        Static.staticValue++;

        // Gọi static method
        Static.staticGreet();

        // Tạo static nested class
        Static.StaticHelper staticHelper = new Static.StaticHelper();
        staticHelper.showMessage();

        // Tạo object outer class
        Static outer = new Static();

        // Tạo inner class qua object outer
        Static.InnerHelper innerHelper = outer.new InnerHelper();
        innerHelper.showMessage();
    }
}

