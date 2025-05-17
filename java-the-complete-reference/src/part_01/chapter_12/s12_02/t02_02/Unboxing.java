package part_01.chapter_12.s12_02.t02_02;

public class Unboxing {
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
