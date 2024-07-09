package s03_03;

/**
 * 자료형의 변환
 * 리터럴 또는 변수의 자료형을 다른 자료형으로 변환하는 것
 * - 자료형 변환 (Type Conversion)
 * - 자료형 캐스팅 (Type Casting)
 */

public class L03_02 {
    public static void main(String[] args) {
        // 자료형 캐스팅 (Type Casting)
        // 프로그래머에 의해 수동으로 수행되는 자료형 변환
        // 형 변환 연산자 '( )'를 통해 자료형 캐스팅이 수행된다.
        // 변경 전·후 자료형의 호환 여부나 크기 조건에 상관없이 강제로 자료형을 변환할 수 있다.
        long _8b_long   = (long) 1.234;
        int _4b_int     = (int) 1234L;
    }
}
