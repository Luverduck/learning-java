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
        // - 산술 연산자 (Arithmetic Operator)
        int a = 1 + 2;
        // - 비교 연산자 (Relational Operator)
        boolean b = 1 > 2;
        // - 논리 연산자 (Logical Operator)
        boolean c = true && false;
        // - 비트 연산자 (Bitwise Operator)
        int d = 0b1011 ^ 0b1101;
        // - 대입 연산자 (Assignment Operator)
        int e = 0;
        // - instanceof 연산자
        boolean f = "TEST" instanceof String;

        // ✅ 연산자의 피연산자 개수
        // - 단항 연산자 (Unary Operator)
        int g = +a;
        // - 이항 연산자 (Binary Operator)
        int h = a + 3;
        // - 삼항 연산자 (Ternary Operator)
        int i = (b == true) ? 1 : 0;

        // ✅ 연산자의 결합성 (Associative)
        // - 왼쪽 결합성 (Left-associative)
        int j = a + d + e + 4;
        // - 오른쪽 결합성 (Right-associative)
        int k = a += d += e += 4;

        // ✅ 연산자의 우선순위 (Precedence)
    }
}
