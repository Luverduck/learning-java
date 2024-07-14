package s05_02;

/**
 * 중괄호의 생략
 * if ~ else 문의 코드 블록 안에 있는 문장이 한 줄일 경우 중괄호 {}를 생략할 수 있다.
 */

public class L02_04 {
    public static void main(String[] args) {
        // ✅ 중괄호의 생략
        int x = 10;
        int y = 20;
        if(x > y)
            System.out.println(">");
        else if(x < y)
            System.out.println("<");
        else
            System.out.println("=");
    }
}
