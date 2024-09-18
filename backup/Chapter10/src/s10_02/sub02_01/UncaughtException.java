package s10_02.sub02_01;

public class UncaughtException {

    static void method3() {
        try {
            int x = 1 / 0;
        }
        catch(Exception e) {
            System.out.println("예외 발생");
        }
    }

    static void method2() {
        method3();
    }

    static void method1() {
        method2();
    }

    public static void main(String[] args) {
        method1();
    }
}
