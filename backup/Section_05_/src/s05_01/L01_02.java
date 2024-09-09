package s05_01;

/**
 * 프로그램의 제어 구조 (Control Structure)
 * 프로그램의 흐름을 제어하기 위한 구조
 * - 순차 구조 (Sequential Structure)
 * - 선택 구조 (Selection Structure)
 * - 반복 구조 (Loop Structure)
 * - 점프 구조 (Jump Structure)
 */

public class L01_02 {
    public static void main(String[] args) {
        // 선택 구조 (Selection Structure)
        // 조건을 만족하는 경우에만 코드 블럭 안의 실행문을 실행
        int x = 10;
        int y = 20;
        if(x < y) {
            System.out.println(x + y);
        }
    }
}
