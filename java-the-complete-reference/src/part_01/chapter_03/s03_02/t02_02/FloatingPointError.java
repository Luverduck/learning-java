package part_01.chapter_03.s03_02.t02_02;

public class FloatingPointError {
    public static void main(String[] args) {

        // 부동소수점 오차

        double fDouble = 1.0;

        double fDoubleSum = 0.0;
        for(int i = 0; i < 10; ++i)
            fDoubleSum += 0.1;

        System.out.println(fDouble == fDoubleSum); // false

    }
}
