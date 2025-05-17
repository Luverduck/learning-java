package part_01.chapter_08.s08_06.t06_01;

public abstract class MyClassSuperAbstract {

    String sFieldSuper = "MyClassSuperAbstract의 필드";
    void methodSuper() {
        System.out.println("MyClassSuperAbstract의 메소드 호출");
    }

    // 추상 메소드 (Abstract Method)
    abstract void methodSuperAbstract();

}
