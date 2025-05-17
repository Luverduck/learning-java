package part_01.chapter_04.s04_09.t09_03;

public class BitwiseAssignmentOperator {
    public static void main(String[] args) {

        // 비트 대입 연산자(Bitwise Assignment Operator)
        int x;
        x = 0b10001101;
        System.out.println( "x &= 0b11111111 : " + Integer.toBinaryString(x &= 0b11111111) );
        x = 0b10001101;
        System.out.println( "x |= 0b11111111 : " + Integer.toBinaryString(x |= 0b11111111) );
        x = 0b10001101;
        System.out.println( "x ^= 0b11111111 : " + Integer.toBinaryString(x ^= 0b11111111) );
        x = 0b10001101;
        System.out.println( "x << 2 : " + Integer.toBinaryString(x <<= 2) );
        x = 0b10001101;
        System.out.println( "x >> 2 : " + Integer.toBinaryString(x >>= 2) );

    }
}
