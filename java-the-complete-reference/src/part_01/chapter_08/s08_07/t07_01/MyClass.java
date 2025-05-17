package part_01.chapter_08.s08_07.t07_01;

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
    // 상위 클래스에서 final 키워드로 선언된 메소드는 하위 클래스에서 오버라이딩할 수 없다.
    /*@Override
    void methodSuperFinal() {
        System.out.println("오버라이딩 된 MyClassSuper의 메소드 호출");
    }*/

}
