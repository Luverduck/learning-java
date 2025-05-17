package part_01.chapter_04.s04_05.t05_01;

public class BitwiseOperator {
    public static void main(String[] args) {

        // 비트 연산자 (Bitwise Operator)
        int x = 0b10100110;
        int y = 0b11011100;
        System.out.println( "x & y : " + Integer.toBinaryString(x & y) );
        System.out.println( "x | y : " + Integer.toBinaryString(x | y) );
        System.out.println( "x & y : " + Integer.toBinaryString(x & y) );
        System.out.println( "~x : " + Integer.toBinaryString(~x) );
        System.out.println( "x << 2 : " + Integer.toBinaryString(x << 1) );
        System.out.println( "x >> y : " + Integer.toBinaryString(x >> 2) );

    }
}
