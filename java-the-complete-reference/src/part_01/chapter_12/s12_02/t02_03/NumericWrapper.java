package part_01.chapter_12.s12_02.t02_03;

public class NumericWrapper {
    public static void main(String[] args) {

        // 숫자형 래퍼 클래스 (Numeric Wrapper Class)

        // 박싱 (Boxing)
        // 정수형
        Byte wByteBox = Byte.valueOf((byte) 123);
        Short wShortBox = Short.valueOf((short) 123);
        Integer wIntBox = Integer.valueOf(123);
        Long wLongBox = Long.valueOf(123L);
        // 부동소수점형
        Float wFloatBox = Float.valueOf(1.23f);
        Double wDoubleBox = Double.valueOf(1.23);

        // 언박싱 (Unboxing)
        // 정수형
        byte pByteUnbox = wByteBox.byteValue();
        short pShortUnbox = wShortBox.shortValue();
        int pIntUnbox = wIntBox.intValue();
        long pLongUnbox = wLongBox.longValue();
        // 부동소수점형
        float pFloatUnbox = wFloatBox.floatValue();
        double pDoubleUnbox = wDoubleBox.doubleValue();

        // 문자열 파싱 (Parsing)
        // 정수형
        byte pBytePars = Byte.parseByte("123");
        short pShortPars = Short.parseShort("123");
        int pIntPars = Integer.parseInt("123");
        long pLongPars = Long.parseLong("123");
        // 부동소수점형
        float pFloatPars = Float.parseFloat("1.23");
        double pDoublePars = Double.parseDouble("1.23");
        // 기수가 적용된 숫자로 문자열 파싱 (⭐ 정수형만 존재)
        byte pByteParsRadix = Byte.parseByte("111", 2);
        short pShortParsRadix = Short.parseShort("111", 8);
        int pIntParsRadix = Integer.parseInt("111", 10);
        long pLongParsRadix = Long.parseLong("111", 16);

        // 문자열 파싱 후 박싱 (Parsing & Boxing)
        // 정수형
        Byte wByteParsBox = Byte.valueOf("123");
        Short wShortParsBox = Short.valueOf("123");
        Integer wIntParsBox = Integer.valueOf("123");
        Long wLongParsBox = Long.valueOf("123");
        // 부동소수점형
        Float wFloatParsBox = Float.valueOf("1.23");
        Double wDoubleParsBox = Double.valueOf("1.23");

    }
}