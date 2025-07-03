public class Immutable_Mutable {
    public static void main(String[] args) {
        //Imutable
        String s = "Java";
        s = s + " Training";
        System.out.println(s);
        //Mutable
        StringBuilder cp = new StringBuilder("Java");
        cp.append(" Training");
        System.out.println(cp);
    }
}
// Immutable những nội dung của String không bị thay đổi, nếu có sự thay đổi thì là tạo String mới...
// Mutable là nội dung của Object có thể bị thay đổi sau khi tạo ra (Có thể tạo bằng StringBuilder, Array,......)