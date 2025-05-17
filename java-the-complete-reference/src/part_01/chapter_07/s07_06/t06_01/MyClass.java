package part_01.chapter_07.s07_06.t06_01;

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
    int iField;
    // 메소드 (Method)
    void method() {
        System.out.println("메소드 호출");
    }
    // 생성자 (Constructor)
    MyClass(int iParam) {
        System.out.println("생성자 호출");
        this.iField = iParam;
    }

}
