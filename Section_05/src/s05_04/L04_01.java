package s05_04;

/**
 * while 문
 * while 문의 조건식 결과가 true인 동안 while 문의 코드 블록 안에 있는 문장을 반복 실행한다.
 *
 * while 문의 실행 과정
 * 1. while 문의 조건식 결과가 true인 경우 while 문의 코드 블록 안에 있는 문장 실행
 * 2. 이후 조건식 결과가 true인 동안 while 문의 코드 블록 안에 있는 문장을 반복 실행
 * ⭐ while 문은 루프 진입 조건과 루프 반복 조건을 모두 검사한다.
 */

public class L04_01 {
    public static void main(String[] args) {
        // ⭐ while 문은 루프 진입 조건과 루프 반복 조건을 모두 검사한다.
        int x = 0;
        //int x = 10; // 루프 진입 불가
        while(x < 10)
        {
            System.out.println(x);
            x++;
        }
    }
}
