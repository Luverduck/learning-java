package part_01.chapter_08.s08_01.t01_02;

public class MyClass extends MyClassSuper {

    String sField = "필드";
    void method() {
        System.out.println("메소드 호출");
    }

    void memberAccess() {
        // 상위 클래스의 멤버 접근
        System.out.println("%s 접근".formatted(sFieldSuper));
        methodSuper();
        // 상위 클래스의 private 멤버 접근
        /*System.out.println("%s 접근".formatted(sFieldSuperPrivate));
        methodSuperPrivate();*/
    }

}
