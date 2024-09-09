package s10_04.L04_01;

/**
 * 언박싱 (Unboxing)
 * 숫자 래퍼 클래스의 인스턴스를 숫자 원시 자료형으로 변환
 */

public class NumberUnboxing {
    public static void main(String[] args) {
        Byte wByte = Byte.valueOf((byte) 123);
        Short wShort = Short.valueOf((short) 123);
        Integer wInt = Integer.valueOf(123);
        Long wLong = Long.valueOf(123L);
        Float wFloat = Float.valueOf(1.23f);
        Double wDouble = Double.valueOf(1.23);

        // ✅ 언박싱 (Unboxing)

        // - 정수형
        byte pByte = wByte.byteValue();
        short pShort = wShort.shortValue();
        int pInt = wInt.intValue();
        long pLong = wLong.longValue();

        // - 부동소수점형
        float pFloat = wFloat.floatValue();
        double pDouble = wDouble.doubleValue();
    }
}
