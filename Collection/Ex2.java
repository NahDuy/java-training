import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Student {
    String student_code;
    String name;

    public Student(String student_code, String name) {
        this.student_code = student_code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{code='" + student_code + "', name='" + name + "'}";
    }
}

public class Ex2 {
    public static void main(String[] args) {
        List<Student> cp = new ArrayList<>();
        Random random = new Random();

        for(int i = 0 ; i < 10000 ; i ++){
            String code = genRandomString(16);
            String name =  "Student" + i;
            cp.add(new Student(code, name));
        }
        cp.stream().limit(5).forEach(System.out::println);

    }

    public static String genRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }
}
