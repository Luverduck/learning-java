package s05_04;

/**
 * do ~ while 문
 * while 문의 조건식 결과가 true인 동안 do 문의 코드 블록 안에 있는 문장을 반복 실행한다.
 *
 * do ~ while 문의 실행 과정
 * 1. do 문 안에 있는 문장 실행
 * 2. 이후 조건식 결과가 true인 동안 do 문의 코드 블록 안에 있는 문장을 반복 실행
 * ⭐ do ~ while 문은 루프 반복 조건만 검사한다. (루프 진입 조건은 검사하지 않는다)
 */

public class L04_02 {
    public static void main(String[] args) {
        // ⭐ do ~ while 문은 루프 반복 조건만 검사한다. (루프 진입 조건은 검사하지 않는다)
        int x = 10;
        do {
            System.out.println(x);
            x++;
        } while(x < 10);
    }
}
