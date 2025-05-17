package part_01.chapter_06.s06_03.t03_01;

public class MyClass {

    // 필드 (Field)
    int field = 1;

    // 메소드 (Method)
    // 호출부에서 전달한 인수는 메소드의 매개변수 초기화에 사용된다.
    public void method(int iParam, double fParam, boolean bParam, char cParam) {
        System.out.println("메소드 호출");
        System.out.println("%d %f %b %c".formatted(iParam, fParam, bParam, cParam));
    }

}