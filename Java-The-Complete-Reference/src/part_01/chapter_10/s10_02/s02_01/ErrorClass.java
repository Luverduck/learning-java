package part_01.chapter_10.s10_02.s02_01;

public class ErrorClass {
    public static void main(String[] args) {

        // Error 클래스
        try {
            methodRecursive();
        }
        catch(Error e) {
            System.out.println(e.toString());
            // java.lang.StackOverflowError
        }

    }

    public static void methodRecursive() {
        methodRecursive();
    }
}
