package part_01.chapter_03.s03_03.t03_01;

public class IntegerLiteral {
    public static void main(String[] args) {

        // 정수 리터럴 (Integer Literal)

        // 정수 리터럴의 자료형
        // int형 정수 리터럴
        byte iByte = 11;
        short iShort = 11;
        int iInt = 11;
        // long형 정수 리터럴
        long iLong = 11L;

        // 정수 리터럴의 기수
        // 10진수 정수 리터럴
        int iInt10 = 11;    // 10 + 1 = 11
        // 16진수 정수 리터럴
        int iInt16 = 0x11;  // 16 + 1 = 17
        // 8진수 정수 리터럴
        int iInt8 = 011;    // 8 + 1 = 9
        // 2진수 정수 리터럴
        int iInt2 = 0b11;   // 2 + 1 = 3
        System.out.printf("%d %d %d %d%n", iInt10, iInt16, iInt8, iInt2);

    }
}
