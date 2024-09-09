package s10_04.L04_01;

/**
 * 박싱 (Boxing)
 * 숫자 원시 자료형을 숫자형 래퍼 클래스의 인스턴스로 변환
 */

public class NumberBoxing {
    public static void main(String[] args) {
        // ✅ 박싱 (Boxing)

        // - 정수형
        Byte wByte = Byte.valueOf((byte) 123);
        Short wShort = Short.valueOf((short) 123);
        Integer wInt = Integer.valueOf(123);
        Long wLong = Long.valueOf(123L);

        // - 부동소수점형
        Float wFloat = Float.valueOf(1.23f);
        Double wDouble = Double.valueOf(1.23);
    }
}
