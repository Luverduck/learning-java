package s04_06;

/**
 * 비교 연산자 (Relational Operator)
 * 피연산자간의 상대적 크기의 비교를 수행하는 연산자
 */

public class L06_01 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        // ==	    왼쪽 피연산자가 오른쪽 피연산자와 같으면 1을 반환한다.
        boolean a = x == y;

        // !=	    왼쪽 피연산자가 오른쪽 피연산자와 다르면 1을 반환한다.
        boolean b = x != y;

        // >	    왼쪽 피연산자가 오른쪽 피연산자와 크면 1을 반환한다.
        boolean c = x > y;

        // >=	    왼쪽 피연산자가 오른쪽 피연산자와 크거나 같으면 1을 반환한다.
        boolean e = x >= y;

        // <	    왼쪽 피연산자가 오른쪽 피연산자와 작으면 1을 반환한다.
        boolean f = x < y;

        // <=	    왼쪽 피연산자가 오른쪽 피연산자와 작거나 같으면 1을 반환한다.
        boolean g = x <= y;
    }
}
