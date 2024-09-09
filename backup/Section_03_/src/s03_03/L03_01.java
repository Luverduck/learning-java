package s03_03;

/**
 * 자료형의 변환
 * 리터럴 또는 변수의 자료형을 다른 자료형으로 변환하는 것
 * - 자료형 변환 (Type Conversion)
 * - 자료형 캐스팅 (Type Casting)
 */

public class L03_01 {
    public static void main(String[] args) {
        // 자료형 변환 (Type Conversion)
        // 컴파일러에 의해 자동으로 수행되는 자료형의 변환
        // 다음의 조건을 만족하는 경우 컴파일러에 의해 자동으로 자료형 변환이 수행된다.
        // - 변환 전 자료형과 변환 후 자료형이 서로 호환 가능(compatible)할 것
        // - 변환 전 자료형보다 변환 후 자료형의 크기가 더 클 것
        long    _8b_long    = 1234;     // int   -> long
        double  _8b_double  = 1.234f;   // float -> double

        // 예외적으로, 정수형을 부동소수점형에 대입할 때 조건과 상관없이 자료형 변환이 이루어진다.
        float _4b_float = 1234L;        // long  -> float
    }
}
