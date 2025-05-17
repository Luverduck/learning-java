package part_01.chapter_07.s07_01.t01_01;

public class MyClass {

    // 메소드 오버로딩 (Method Overloading)
    void method() {
        System.out.println("method()");
    }
    void method(int x) {
        System.out.println("method(int x) [x = %d]".formatted(x));
    }
    void method(double x) {
        System.out.println("method(double x) [x = %f]".formatted(x));
    }
    void method(int x, int y) {
        System.out.println("method(int x, int y) [x = %d, y = %d]".formatted(x, y));
    }
    void method(int x, double y) {
        System.out.println("method(int x, double y) [x = %d, y = %f]".formatted(x, y));
    }

}
