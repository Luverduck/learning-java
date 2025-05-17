package part_01.chapter_06.s06_05.t05_01;

public class MyClass {

    // 필드 (Field)
    int i;
    double f;
    boolean b;
    char c;
    String s;

    // 메소드 (Method)
    void method(int i, double f, boolean b, char c, String s) {
        System.out.println("매개변수 : %d, %f, %b, %c, %s".formatted(i, f, b, c, s));
        System.out.println("필드 : %d, %f, %b, %c, %s".formatted(this.i, this.f, this.b, this.c, this.s));
    }

    // 생성자 (Constructor)
    MyClass(int i, double f, boolean b, char c, String s) {
        System.out.println("생성자 호출");
        this.i = i;
        this.f = f;
        this.b = b;
        this.c = c;
        this.s = s;
    }

}