package s10_01.sub01_03;

/**
 * 오류 (Error)
 * 프로그램의 비정상적인 동작 또는 그로 인해 작동을 멈추는 것
 * - 발생 원인에 따른 분류
 *     - 구문 오류 (Syntax Error)
 *     - 의미 오류 (Semantic Error)
 *     - 논리 오류 (Logical Error)
 */

public class LogicalError {
    // 논리 오류 (Logical Error)
    // 프로그래밍 언어의 문법을 위배하지는 않았으나 잘못된 논리 설계로 발생하는 에러

    // 1) 잘못된 논리 구성
    int mod(int a, int b)
    {
        return a % b;             // 몫을 구하는 메소드에서 나머지 반환
    };

    public void main(String[] args) {
        // 2) 무한 루프
        int i = 0;
        while(i < 10)                 // 잘못된 종료 조건으로 인한 무한 루프
        {
            System.out.println(i);
        };
    }
}
