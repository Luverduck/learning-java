package s10_03.L03_01;

/**
 * 래퍼 클래스 (Wrapper Class)
 * 원시 자료형을 객체로 다루기 위해 사용하는 클래스
 */

public class Main {
    public static void main(String[] args) {
        // 래퍼 클래스의 종류
        // ⭐ 정수형, 부동소수점형 래퍼 클래스는 공통적으로 추상 클래스 Number를 상속받는다.
        // ✅ 정수형
        Byte w_byte;
        Short w_short;
        Integer w_int;
        Long w_long;
        // ✅ 부동소수점형
        Float w_float;
        Double w_double;
        // ✅ 논리형
        Boolean w_boolean;
        // ✅ 문자형
        Character w_char;
    }
}
