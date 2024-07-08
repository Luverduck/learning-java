package s03_01;

/**
 * 정수 리터럴 (Integer Literal)
 * 정수 형태의 값 자체를 의미한다.
 */

public class L01_02 {
    public static void main(String[] args) {
        // 정수 리터럴의 기수
        int _base_10  = 14;      // 14는   10진법 숫자
        int _base_16  = 0xe;     // e는    16진법 숫자를 나타내며 10진법 변환시 14
        int _base_8   = 016;     // 16은    8진법 숫자를 나타내며 10진법 변환시 14
        int _base_2   = 0b1110;  // 1110은  2진법 숫자를 나타내며 10진법 변환시 14

        // 정수 리터럴의 자료형
        int _4b_int   = 2147483647;   //  int형 정수 리터럴 2147483647
        long _8b_long = 2147483648L;  // long형 정수 리터럴 2147483648
    }
}
