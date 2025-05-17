package part_01.chapter_15.s15_05.t05_01;

public class MyClass {

    // 필드 (Field)
    int iField = 10;                // 필드 또는 인스턴스 변수
    static int iFieldStatic = 20;   // 정적 필드 또는 클래스 변수

    // 메소드 (Method)
    public void vMethodInstanceVariable() {
        // 람다 표현식의 인스턴스 변수 캡처
        MyFunction printer = () -> {
            int value = iField;
            System.out.println("인스턴스 변수 캡처 : " + value);
        };
        // 람다 표현식 실행
        printer.execute();
    }
    public void vMethodClassVariable() {
        // 람다 표현식의 클래스 변수 캡처
        MyFunction printer = () -> {
            int value = iFieldStatic;
            System.out.println("클래스 변수 캡처 : " + value);
        };
        // 람다 표현식 실행
        printer.execute();
    }

}
