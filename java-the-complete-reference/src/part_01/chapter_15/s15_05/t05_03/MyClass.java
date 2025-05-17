package part_01.chapter_15.s15_05.t05_03;

import part_01.chapter_15.s15_05.t05_01.MyFunction;

public class MyClass {

    // 메소드 (Method)
    public void vMethodVariableCapture() {
        // Effectively final이 아닌 지역 변수
        int iVariable = 30;
        iVariable = 40;
        // 람다 표현식은 Effectively final이 아닌 지역 변수를 캡처할 수 없다.
        /*MyFunction printer = () -> {
            int value = iVariable; // Variable used in lambda expression should be final or effectively final
            System.out.println(value);
        };
        // 람다 표현식 실행
        printer.execute();*/
    }

}
