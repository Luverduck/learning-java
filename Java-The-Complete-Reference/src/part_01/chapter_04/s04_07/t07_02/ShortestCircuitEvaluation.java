package part_01.chapter_04.s04_07.t07_02;

public class ShortestCircuitEvaluation {
    public static void main(String[] args) {

        // 단축 평가 계산 (Short-circuit Evaluation)

        // p && q에서 p가 false일 때 q의 평가 없이 false로 평가한다.
        boolean bBoolean1 = (2 > 3) && (5 == 5);
        // p가 true일 경우 false인 피연산자를 발견할 때까지 평가를 진행한다.
        boolean bBoolean3 = (2 < 3) && (5 == 5);

        // p || q에서 p가 true일 때 q의 평가 없이 true로 평가한다.
        boolean bBoolean2 = (2 < 3) || (5 == 5);
        // p가 false일 경우 true인 피연산자를 발견할 때까지 평가한다.
        boolean bBoolean4 = (2 > 3) || (5 == 5);

    }
}
