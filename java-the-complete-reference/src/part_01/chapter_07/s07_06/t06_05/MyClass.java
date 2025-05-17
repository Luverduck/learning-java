package part_01.chapter_07.s07_06.t06_05;

public class MyClass {

    // 클래스 멤버 (Class Member)
    // 정적 필드 (Static Field)
    static int iFieldStatic;
    // 정적 메소드 (Static Method)
    static void methodStatic() {
        System.out.println("static 메소드 호출");
    }

    // static 블록
    static {
        System.out.println("static 블록 실행");
        iFieldStatic++;
    }

}
