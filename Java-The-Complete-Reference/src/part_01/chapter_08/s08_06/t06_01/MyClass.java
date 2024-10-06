package part_01.chapter_08.s08_06.t06_01;

public class MyClass extends MyClassSuperAbstract {

    String sField = "MyClass의 필드";
    void method() {
        System.out.println("MyClass의 오버로딩 된 메소드 호출");
    }
    @Override
    void methodSuper() {
        System.out.println("오버라이딩 된 MyClassSuper의 메소드 호출");
    }

    // 추상 메소드의 구현
    @Override
    void methodSuperAbstract() {
        System.out.println("MyClassSuper의 구현된 추상 메소드 호출");
    }
}
