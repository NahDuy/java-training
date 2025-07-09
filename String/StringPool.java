import java.util.Collections;

public class StringPool{
    public static void main(String[] args) {
        // Tạo trong String Pool
        String str1 = "abc";
        String str2 = "abc";

        // Tạo trong Java Heap Space
        String str3 = new String("abc");
        // Tạo thủ công đưa vào pool
        String str4 = new String("abc").intern();

        // So sánh bằng ==
        System.out.println("str1 == str2 : " + (str1 == str2)); // true, cùng tham chiếu trong pool
        System.out.println("str1 == str3 : " + (str1 == str3)); // false, khác tham chiếu

        // So sánh bằng equals()
        System.out.println("str1.equals(str3) : " + str1.equals(str3)); // true, cùng nội dung

        // So sánh == sẽ là so sánh đến vị trí tham chiếu
        // So sánh equals sẽ là so sánh giá trị của chuỗi kí tự 
        
        
    }
}

