package part_01.chapter_08.s08_03.t03_02;

public class MyClassSub extends MyClass {

    String sFieldSub = "MyClassSub의 필드";
    void methodSub() {
        System.out.println("MyClassSub의 메소드 호출");
    }
    MyClassSub() {
        System.out.println("MyClassSub의 생성자 호출");
    }

}