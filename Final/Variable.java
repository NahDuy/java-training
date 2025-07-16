public class Variable {
    public static void main(String[] args) {
        final int x;
        x = 50; // được gán lần đầu
        // x = 60; // lỗi biên dịch
        System.out.println("x = " + x);
    }
}
//Final Fields 
static final int MAX_WIDTH = 999;
//Final Arguments
public void methodWithFinalArguments(final int x) {
    x = 1; // lỗi biên dịch
}
