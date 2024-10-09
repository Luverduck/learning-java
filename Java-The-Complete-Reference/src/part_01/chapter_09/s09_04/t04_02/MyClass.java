package part_01.chapter_09.s09_04.t04_02;

public class MyClass extends MyClassSuper implements MyInterface1, MyInterface2 {

    String sField = "MyClass의 필드 접근";
    void method() {
        System.out.println("MyClass의 메소드 호출");
    }

    // MyInterface1의 추상 메소드 구현
    @Override
    public void methodInterface1() {
        System.out.println(MyInterface1.sFieldInterface1);
        System.out.println("MyInterface1의 메소드 구현 호출");
    }

    // MyInterface2의 추상 메소드 구현
    @Override
    public void methodInterface2() {
        System.out.println(MyInterface2.sFieldInterface2);
        System.out.println("MyInterface2의 메소드 구현 호출");
    }

}
