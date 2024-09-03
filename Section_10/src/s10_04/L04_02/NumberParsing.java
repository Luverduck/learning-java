package s10_04.L04_02;

/**
 * 문자열 파싱 (Parsing)
 * 문자열을 숫자로 분석한 값을 숫자 원시 자료형으로 변환
 */

public class NumberParsing {
    public static void main(String[] args) {
        // ✅ 문자열 파싱 (Parsing)
        // 문자열을 10진수로 분석한 값을 숫자 원시 자료형으로 변환

        // - 정수형
        byte pByte = Byte.parseByte("123");
        short pShort = Short.parseShort("123");
        int pInt = Integer.parseInt("123");
        long pLong = Long.parseLong("123");

        // - 부동소수점형
        float pFloat = Float.parseFloat("1.23");
        double pDouble = Double.parseDouble("1.23");
    }
}
