package s10_04.L04_02;

/**
 * 문자열 파싱 (Parsing)
 * 문자열을 기수가 적용된 숫자로 분석한 값을 숫자 원시 자료형으로 변환
 */

public class NumberParsingRadix {
    public static void main(String[] args) {
        // ✅ 문자열 파싱 (Parsing)
        // 문자열을 기수가 적용된 숫자로 분석한 값을 숫자 원시 자료형으로 변환

        // - 정수형 (⭐ 정수형에 대한 메소드만 존재)
        byte pByte = Byte.parseByte("111", 2);
        short pShort = Short.parseShort("111", 8);
        int pInt = Integer.parseInt("111", 10);
        long pLong = Long.parseLong("111", 16);
    }
}
