package s05_01;

/**
 * 프로그램의 제어 구조 (Control Structure)
 * 프로그램의 흐름을 제어하기 위한 구조
 * - 순차 구조 (Sequential Structure)
 * - 선택 구조 (Selection Structure)
 * - 반복 구조 (Loop Structure)
 * - 점프 구조 (Jump Structure)
 */

public class L01_04 {
    public static void main(String[] args) {
        // 점프 구조 (Jump Structure)
        // 프로그램의 흐름을 특정 위치로 이동시킨 후 순차 실행
        int x = 10;
        int y = 20;
        outerLoop :
        while(true)
        {
            x++;
            if(x > y)
                break outerLoop;
        }
        System.out.println(x);
    }
}
