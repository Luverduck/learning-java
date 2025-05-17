package part_01.chapter_08.s08_02.t02_02;

public class MyClassSuper {

    String sFieldSuper = "상위 클래스의 필드";
    void methodSuper() {
        System.out.println("상위 클래스의 메소드 호출");
    }

    MyClassSuper(String sParam) {
        this.sFieldSuper = sParam;
    }

}
