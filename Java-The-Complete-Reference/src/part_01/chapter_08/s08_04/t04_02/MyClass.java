package part_01.chapter_08.s08_04.t04_02;

public class MyClass extends MyClassSuper {

    String sField = "MyClass의 필드";
    void method() {
        System.out.println("MyClass의 메소드 호출");
    }

    // 메소드 오버라이딩 (Method Overriding)
    @Override
    void methodSuper() {
        System.out.println("오버라이딩 된 MyClassSuper의 메소드 호출");
    }

}
