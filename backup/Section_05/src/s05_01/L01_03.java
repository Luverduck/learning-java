package s05_01;

/**
 * 프로그램의 제어 구조 (Control Structure)
 * 프로그램의 흐름을 제어하기 위한 구조
 * - 순차 구조 (Sequential Structure)
 * - 선택 구조 (Selection Structure)
 * - 반복 구조 (Loop Structure)
 * - 점프 구조 (Jump Structure)
 */

public class L01_03 {
    public static void main(String[] args) {
        // 반복 구조 (Loop Structure)
        // 조건이 참일 동안만 코드 블럭 안의 실행문을 반복 실행
        int x = 10;
        int y = 20;
        while(x < y)
        {
            System.out.println(x);
            x++;
        }
    }
}
