package part_01.chapter_08.s08_05.t05_02;

public class MyClass extends MyClassSuper {

    String sField = "MyClass의 필드";
    void method() {
        System.out.println("MyClass의 메소드 호출");
    }

    @Override
    void methodSuper() {
        System.out.println("오버라이딩 된 MyClassSuper의 메소드 호출");
    }

}
