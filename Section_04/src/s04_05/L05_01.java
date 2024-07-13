package s04_05;

/**
 * 비트 연산자 (Bitwise Operator)
 * 피연산자간의 비트 단위 연산을 수행하는 연산자
 */

public class L05_01 {
    public static void main(String[] args) {
        short x = 0b10100110;
        short y = 0b11011100;

        // &        두 피연산자의 대응되는 비트가 모두 1이면 1을 반환한다.        (비트 AND 연산)
        System.out.println( "x & y : " + Integer.toBinaryString(x & y) );

        // |	    두 피연산자의 대응되는 비트 중 하나라도 1이면 1을 반환한다.    (비트 OR 연산)
        System.out.println( "x | y : " + Integer.toBinaryString(x | y) );

        // ^	    두 피연산자의 대응되는 비트가 서로 다를 경우 1을 반환한다.     (비트 XOR 연산)
        System.out.println( "x & y : " + Integer.toBinaryString(x & y) );

        // ~    	피연산자의 비트가 1이면 0, 0이면 1을 반환한다.              (비트 NOT 연산)
        System.out.println( "~x : " + Integer.toBinaryString(~x) );

        // <<       지정한 수만큼 비트들을 전부 왼쪽으로 이동시킨다.              (왼쪽 Shift 연산)
        System.out.println( "x << 2 : " + Integer.toBinaryString(x << 1) );

        // >>       지정한 수만큼 비트들을 전부 오른쪽으로 이동시킨다.            (오른쪽 Shift 연산)
        System.out.println( "x >> y : " + Integer.toBinaryString(x >> 2) );
    }
}
