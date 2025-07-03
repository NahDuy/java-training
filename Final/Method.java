public class Method {
    class Parent {
        final void show() {
            System.out.println("This is a final method.");
        }
    }

    class Child extends Parent {
        // Lỗi biên dịch:
        // void show() {
        //     System.out.println("Cannot override final method.");
        // }
    }

}
