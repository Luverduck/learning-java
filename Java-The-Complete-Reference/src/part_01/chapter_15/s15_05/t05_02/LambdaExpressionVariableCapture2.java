package part_01.chapter_15.s15_05.t05_02;

public class LambdaExpressionVariableCapture2 {
    public static void main(String[] args) {

        // 인스턴스 생성
        MyClass m = new MyClass();
        // final 지역 변수 캡처
        m.vMethodFinalVariable();
        // 유효 final 지역 변수 캡처
        m.vMethodEffectivelyFinalVariable();

    }
}
