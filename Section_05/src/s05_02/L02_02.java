package s05_02;

/**
 * if ~ else 문
 * if 문의 조건식 결과가 true이면 if 문의 코드 블록 안에 있는 문장을 실행한다.
 * 그렇지 않으면 else 문의 코드 블록 안에 있는 문장을 실행한다.
 */

public class L02_02 {
    public static void main(String[] args) {
        // ✅ if ~ else 문
        int x = 10;
        int y = 20;
        if(x > y) {
            System.out.println(">");
        }
        else {
            System.out.println("<");
        }
    }
}
