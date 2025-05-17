package part_01.chapter_09.s09_05.t05_01;

public class DefaultMethod {
    public static void main(String[] args) {

        // default 메소드 호출 (기본 구현)
        MyInterface m1 = new MyInterfaceImpl1();
        m1.methodInterfaceDefault();

        // default 메소드 호출 (오버라이딩)
        MyInterface m2 = new MyInterfaceImpl2();
        m2.methodInterfaceDefault();

    }
}
