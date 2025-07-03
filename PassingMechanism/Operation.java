class Operation {
    int data = 50;

    public static void change1(int num) {
        num = 8; // chỉ có hiệu quả trong phương thức
    }

    public void change2(Operation op) {
        op.data = op.data + 100; // truyền cả đối tượng vào nên sẽ có sự thay đổi
    }

    static void reassign(Operation op) {
        op = new Operation(); // tạo object mới
        op.data = 100; // khi gán vào thì cũng là bản sao tham chiếu đến nên không khiến giá trị thay
                       // đổi
    }

    public static void main(String args[]) {
        int num = 4;
        change1(num);
        System.out.println("After change1: " + num);

        Operation op = new Operation();
        reassign(op);
        System.out.println("After Reassign: " + op.data);
        System.out.println("Before change2: " + op.data);
        op.change2(op);
        System.out.println("After change2: " + op.data);
    }
}