package s10_01.sub01_04;

/**
 * 오류 (Error)
 * 프로그램의 비정상적인 동작 또는 그로 인해 작동을 멈추는 것
 * - 발생 시점에 따른 분류
 *     - 컴파일 오류 (Compile-time Error)
 *     - 런타임 오류 (Run-time Error)
 */

public class RuntimeError {
    public static void main(String[] args) {
        // 런 타임 에러 (Run-time Error)
        // 컴파일된 소스 코드를 실행하는 중에 발생하는 에러
        // 소스 코드를 컴파일한 후 실행하는 과정에서 발생하므로 발생 전까지 에러를 알 수 없다.
        // 동적 의미 오류(Dynamic Semantic Error), 논리 오류(Logical Error)가 이에 해당한다.
        int arr[] = new int[10];
        arr[10] = 100;                // 배열의 범위를 벗어난 요소의 접근
    }
}
