package part_01.chapter_09.s09_04.t04_03;

public abstract class MyClassAbstract implements MyInterface1, MyInterface2  {

    String sFieldSuper = "MyClassSuperAbstract의 필드";
    void methodSuper() {
        System.out.println("MyClassSuperAbstract의 메소드 호출");
    }

    // MyInterface1의 추상 메소드 구현
    @Override
    public void methodInterface1() {
        System.out.println(part_01.chapter_09.s09_04.t04_02.MyInterface1.sFieldInterface1);
        System.out.println("MyInterface1의 메소드 구현 호출");
    }

    // MyInterface2의 추상 메소드 구현
    /*@Override
    public void methodInterface2() {
        System.out.println(part_01.chapter_09.s09_01.t01_02.MyInterface2.sFieldInterface2);
        System.out.println("MyInterface2의 메소드 구현 호출");
    }*/

}
