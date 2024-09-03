package s10_04.L04_03;

/**
 * 문자열 파싱 후 박싱 (Parsing & Boxing)
 * 문자열을 파싱 후 숫자형 래퍼 클래스의 인스턴스로 변환 (parseInt + valueOf)
 */

public class NumberParsingBoxing {
    public static void main(String[] args) {
        // ✅ 문자열 파싱 후 박싱 (Parsing & Boxing)

        // - 정수형
        Byte wByte = Byte.valueOf("123");
        Short wShort = Short.valueOf("123");
        Integer wInt = Integer.valueOf("123");
        Long wLong = Long.valueOf("123");

        // - 부동소수점형
        Float wFloat = Float.valueOf("1.23");
        Double wDouble = Double.valueOf("1.23");
    }
}
