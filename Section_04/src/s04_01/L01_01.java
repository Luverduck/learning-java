package s04_01;

/**
 * 연산자(Operator)
 * 하나 이상의 대상에 대하여 특정 연산을 수행하고 그 결과를 반환하는 특수 기호
 * 연산에 참여하는 대상을 피연산자(Operand)라고 한다.
 */

public class L01_01 {
    public static void main(String[] args) {
        // 연산자의 종류
        // 연산자는 크게 4가지 기준에 따라 분류할 수 있다.
        // ✅ 연산자의 기능
        // - 부호 연산자 (Sign Operator)
        int a = -1;
        // - 증감 연산자 (Increment and Decrement Operator)
        int b = a++;
        // - 산술 연산자 (Arithmetic Operator)
        int c = 1 + 2;
        // - 비트 연산자 (Bitwise Operator)
        int d = 0b1011 ^ 0b1101;
        // - 비교 연산자 (Relational Operator)
        boolean e = 1 > 2;
        // - 논리 연산자 (Logical Operator)
        boolean f = true && false;
        // - 대입 연산자 (Assignment Operator)
        int g = 0;
        // - instanceof 연산자
        boolean h = "TEST" instanceof String;

        // ✅ 연산자의 피연산자 개수
        // - 단항 연산자 (Unary Operator)
        int i = +a;
        // - 이항 연산자 (Binary Operator)
        int j = a + 3;
        // - 삼항 연산자 (Ternary Operator)
        int k = (3 % 2 == 0) ? 1 : 0;

        // ✅ 연산자의 결합성 (Associative)
        // - 왼쪽 결합성 (Left-associative)
        int l = a + b + c + d;
        // - 오른쪽 결합성 (Right-associative)
        int m = a += b += c += d;

        // ✅ 연산자의 우선순위 (Precedence)
    }
}
