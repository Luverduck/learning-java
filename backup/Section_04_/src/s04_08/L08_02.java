package s04_08;

/**
 * 복합 대입 연산자 (Compound Assignment Operator)
 * 피연산자에 특정 연산을 수행한 후 대입 연산을 수행하는 연산자
 * 대입 연산 전 수행하는 연산에 따라 산술 대입 연산자와 비트 대입 연산자로 나눌 수 있다.
 */

public class L08_02 {
    public static void main(String[] args) {
        // ✅ 산술 대입 연산자(Arithmetic Assignment Operator)
        int x = 1;
        // +=	    왼쪽 피연산자에 오른쪽 피연산자를 더한 값을 왼쪽 연산자에 대입한다.
        x += 10;
        // -=	    왼쪽 피연산자에 오른쪽 피연산자를 뺀 값을 왼쪽 연산자에 대입한다.
        x -= 10;
        // *=	    왼쪽 피연산자에 오른쪽 피연산자를 곱한 값을 왼쪽 연산자에 대입한다.
        x *= 5;
        // /=	    왼쪽 피연산자에 오른쪽 피연산자를 나눈 몫을 왼쪽 연산자에 대입한다.
        x *= 5;
        // %=	    왼쪽 피연산자에 오른쪽 피연산자를 나눈 나머지를 왼쪽 연산자에 대입한다.
        x %= 5;

        // ✅ 비트 대입 연산자(Bitwise Assignment Operator)
        int a;
        // &=	    왼쪽 피연산자에 오른쪽 피연산자를 비트 AND 연산한 값을 왼쪽 연산자에 대입한다.
        a = 0b10001101;
        System.out.println( Integer.toBinaryString(a &= 0b11111111) );
        // |=	    왼쪽 피연산자에 오른쪽 피연산자를 비트 OR 연산한 값을 왼쪽 연산자에 대입한다.
        a = 0b10001101;
        System.out.println( Integer.toBinaryString(a |= 0b11111111) );
        // ^=	    왼쪽 피연산자에 오른쪽 피연산자를 비트 XOR 연산한 값을 왼쪽 연산자에 대입한다.
        a = 0b10001101;
        System.out.println( Integer.toBinaryString(a ^= 0b11111111) );
        // <<=	    왼쪽 피연산자에 오른쪽 피연산자만큼 비트 이동 연산한 값을 왼쪽 연산자에 대입한다.
        a = 0b10001101;
        System.out.println( Integer.toBinaryString(a <<= 2) );
        // >>=	    왼쪽 피연산자에 오른쪽 피연산자만큼 비트 이동 연산한 값을 왼쪽 연산자에 대입한다.
        a = 0b10001101;
        System.out.println( Integer.toBinaryString(a >>= 2) );
    }
}
