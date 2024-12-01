package part_01.chapter_15.s15_05.t05_02;

public class MyClass {

    // 메소드 (Method)
    public void vMethodFinalVariable() {
        // final 지역 변수
        final int iVariableFinal = 30;
        // 람다 표현식의 final 지역 변수 캡처
        MyFunction printer = () -> {
            int value = iVariableFinal;
            System.out.println("final 지역 변수 캡처 : " + value);
        };
        // 람다 표현식 실행
        printer.execute();
    }
    public void vMethodEffectivelyFinalVariable() {
        // 유효 final 지역 변수
        int iVariable = 40;
        // 람다 표현식의 유효 final 지역 변수 캡처
        MyFunction printer = () -> {
            int value = iVariable;
            System.out.println("유효 final 지역 변수 캡처 : " + value);
        };
        // 람다 표현식 실행
        printer.execute();
    }

}
