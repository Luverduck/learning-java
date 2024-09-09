package s10_02.L02_02;

public class MyClass
        // extends MyRecord     // ❌ 레코드는 클래스에 상속될 수 없다.
    {
    // 필드 (Field)
    int cFieldInt;
    String cFieldStr;
    // 메소드 (Method)
    void cMethod() {
        System.out.println("클래스의 인스턴스 메소드 실행");
    }
    // 정적 필드 (Static Field)
    static int cFieldStatic;
    // 정적 메소드 (Static Method)
    static void cMethodStatic() {
        System.out.println("클래스의 클래스 메소드 실행");
    }
}
