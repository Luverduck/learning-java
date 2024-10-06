package part_01.chapter_08.s08_07.t07_01;

public class MyClassSuper {

    String sFieldSuper = "MyClassSuper의 필드";
    void methodSuper() {
        System.out.println("MyClassSuper의 메소드 호출");
    }
    // 상위 클래스에서 final 키워드로 선언된 메소드
    final void methodSuperFinal() {
        System.out.println("MyClassSuper의 final 메소드 호출");
    }

}
