package BTAbstract;

public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.insertPhone("Nam", "0909123456");
        book.insertPhone("Nam", "0909123456"); // trùng → không thêm
        book.insertPhone("Nam", "0911222333"); // khác → thêm
        book.insertPhone("Hoa", "0988999777");
        book.searchPhone("Nam");
        book.updatePhone("Hoa", "0999888777");
        book.sort();
        book.removePhone("Nam");
        book.sort();
    }
}
