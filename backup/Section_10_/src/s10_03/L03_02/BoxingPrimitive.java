package s10_03.L03_02;

/**
 * 박싱 (Boxing)
 * 원시 자료형을 래퍼 클래스의 인스턴스로 변환하는 것을 박싱(Boxing)이라 한다.
 */

public class BoxingPrimitive {
    public static void main(String[] args) {
        // 정수형
        Integer wInt = Integer.valueOf(123);

        // 부동소수점형
        Double wDouble = Double.valueOf(1.23);

        // 문자형
        Character wChar = Character.valueOf('a');

        // 논리형
        Boolean wBoolean = Boolean.valueOf(true);
    }
}
