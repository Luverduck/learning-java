package part_01.chapter_08.s08_02.t02_01;

public class MyClass extends MyClassSuper {

    String sField = "필드";
    void method() {
        System.out.println("메소드 호출");
    }

    void memberAccess() {
        // 멤버 접근
        System.out.println("%s 접근".formatted(sField));
        method();
        // this 키워드로 멤버 접근
        System.out.println("%s 접근".formatted(this.sField));
        this.method();
        // super 키워드로 상위 클래스 멤버 접근
        System.out.println("%s 접근".formatted(super.sField));
        super.method();
    }

}
