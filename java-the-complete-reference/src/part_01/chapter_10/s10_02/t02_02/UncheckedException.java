package part_01.chapter_10.s10_02.t02_02;

public class UncheckedException {
    public static void main(String[] args) {

        // Exception 클래스
        // 비 검사 예외 (Unchecked Exception)
        try {
            int x = 10;
            int y = 0;
            int ret = x / y;
        }
        catch(RuntimeException e) {
            System.out.println(e.toString());
            // java.lang.ArithmeticException: / by zero
        }

    }
}
