package s10_03.L03_02;

/**
 * 언박싱 (Unboxing)
 * 래퍼 클래스의 인스턴스를 원시 자료형으로 변환하는 것을 언박싱(Unboxing)이라 한다.
 */

public class UnboxingWrapper {
    public static void main(String[] args) {
        Integer wInt = Integer.valueOf(123);
        Double wDouble = Double.valueOf(1.23);
        Character wChar = Character.valueOf('a');
        Boolean wBoolean = Boolean.valueOf(true);

        // 정수형
        int pInt = wInt.intValue();

        // 부동소수점형
        double pFloat = wDouble.floatValue();

        // 문자형
        char pChar = wChar.charValue();

        // 논리형
        boolean pBoolean = wBoolean.booleanValue();
    }
}
