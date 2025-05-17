package part_01.chapter_03.s03_05.t05_01;

public class ImplicitTypeConversion {
    public static void main(String[] args) {

        // 암시적 형 변환 (Implicit Type Conversion)
        int iInt = 'A';         // char  => int
        long iLong = 10;        // int   => long
        double fDouble = 1.5f;  // float => double

        // 예외적으로, 정수형을 부동소수점형에 대입할 때 조건과 상관없이 암시적 형 변환이 이루어진다.
        float fFloat = 10;

    }
}
