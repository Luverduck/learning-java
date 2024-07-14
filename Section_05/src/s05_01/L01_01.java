package s05_01;

/**
 * 프로그램의 제어 구조 (Control Structure)
 * 프로그램의 흐름을 제어하기 위한 구조
 * - 순차 구조 (Sequential Structure)
 *     실행문을 위에서 아래로 순차적으로 실행
 * - 선택 구조 (Selection Structure)
 *     조건을 만족하는 경우에만 코드 블럭 안의 실행문을 실행
 * - 반복 구조 (Loop Structure)
 *     조건이 참일 동안만 코드 블럭 안의 실행문을 반복 실행
 * - 점프 구조 (Jump Structure)
 *     프로그램의 흐름을 특정 위치로 이동시킨 후 순차 실행
 */

public class L01_01 {
    public static void main(String[] args) {
        // 순차 구조(Sequential Structure)
        // 실행문을 위에서 아래로 순차적으로 실행
        int x = 10;
        int y = 20;
        System.out.println(x + y);
    }
}
