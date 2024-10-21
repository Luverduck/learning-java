package part_01.chapter_12.s12_03.t03_03;

public class AutoBoxingUnboxingInExpression {
    public static void main(String[] args) {

        // 1. 기본 자료형의 값을 래퍼 클래스의 인스턴스로 자동 박싱
        Integer wIntBox = 1;

        // 2. 표현식 wIntBox + 2를 평가할 때 자동 언박싱
        // 3. 평가 결과를 wIntBox에 저장할 때 자동 박싱
        wIntBox = wIntBox + 2;

        // 4. 표현식 wIntBox / 3을 평가할 때 자동 언박싱
        // 5. 평가 결과를 pIntUnbox에 저장
        int pIntUnbox = wIntBox / 3;

    }
}
