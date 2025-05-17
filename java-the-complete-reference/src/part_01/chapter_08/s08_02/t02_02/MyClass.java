package part_01.chapter_08.s08_02.t02_02;

public class MyClass extends MyClassSuper {

    String sField = "필드";
    void method() {
        System.out.println("메소드 호출");
    }

    MyClass(String sParam) {
        // 상위 클래스의 생성자 호출
        super("상위 클래스의 필드 초기화");
        this.sField = sParam;
    }

}
