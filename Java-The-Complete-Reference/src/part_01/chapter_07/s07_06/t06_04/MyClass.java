package part_01.chapter_07.s07_06.t06_04;

public class MyClass {

    // 클래스 멤버 (Class Member)
    // 정적 필드 (Static Field)
    static int iFieldStatic = 100;
    // 정적 메소드 (Static Method)
    static void methodStatic() {
        System.out.println("static 메소드 호출");
    }

    // 인스턴스 멤버 (Instance Member)
    // 필드 (Field)
    int iField = 10;
    // 메소드 (Method)
    void method() {
        System.out.println("메소드 호출");
    }

    // 정적 메소드는 클래스의 정적 멤버에만 접근할 수 있다.
    static void memberAccess() {

        // 클래스 멤버의 접근
        int fieldStatic = iFieldStatic;
        methodStatic();

        // 인스턴스 멤버의 접근
        // int field = iField;
        // method();

    }

}
