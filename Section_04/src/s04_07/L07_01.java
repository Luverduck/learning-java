package s04_07;

/**
 * 논리 연산자 (Logical Operator)
 * 피연산자간의 논리 연산을 수행하는 연산자
 */

public class L07_01 {
    public static void main(String[] args) {
        boolean x = 1 > 2;
        boolean y = 3 < 4;

        // &&	    두 피연산자가 모두 참이면 1을 반환한다. (AND 연산)
        boolean a = x && y;

        // ||	    두 피연산자 중 하나라도 참이면 1을 반환한다. (OR 연산)
        boolean b = x || y;

        // !	    피연산자가 참이면 0, 거짓이면 1을 반환한다. (NOT 연산)
        boolean c = !x;

    }
}
