package s05_02;

/**
 * if 문
 * if 문의 조건식 결과가 true이면 if 문의 코드 블록 안에 있는 문장을 실행한다.
 * 그렇지 않으면 if 문의 코드 블록을 건너뛴다.
 * ⭐ if 문의 코드 블록 안에 있는 문장 실행 / 실행하지 않음에 대한 선택 (이중 분기)
 */

public class L02_01 {
    public static void main(String[] args) {
        // ✅ if 문
        int x = 10;
        int y = 20;
        if(x > y) {
            System.out.println(">");
        }
    }
}
