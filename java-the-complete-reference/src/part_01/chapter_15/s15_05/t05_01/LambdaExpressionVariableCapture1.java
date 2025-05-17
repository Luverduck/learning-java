package part_01.chapter_15.s15_05.t05_01;

public class LambdaExpressionVariableCapture1 {
    public static void main(String[] args) {

        // 인스턴스 생성
        MyClass m = new MyClass();
        // 인스턴스 변수 캡처
        m.vMethodInstanceVariable();
        // 클래스 변수 캡처
        m.vMethodClassVariable();

    }
}
