package s01.sub02;

/**
 * 오류 (Error)
 * 프로그램의 비정상적인 동작 또는 그로 인해 작동을 멈추는 것
 * - 발생 원인에 따른 분류
 *     - 구문 오류 (Syntax Error)
 *     - 의미 오류 (Semantic Error)
 *     - 논리 오류 (Logical Error)
 */

public class SemanticError2 {
    public void main(String[] args) {
        // 의미 오류 (Semantic Error)
        // 프로그래밍 언어의 문법을 위배하지는 않았으나 잘못된 문법 사용으로 발생하는 에러

        // 동적 의미 오류 (Dynamic Semantic Error) : 컴파일러가 감지할 수 없는 오류
        // 1) 배열의 인덱스 범위 초과
        int arr[] = new int[10];
        arr[10] = 100;                // 배열의 범위를 벗어난
    }
}
