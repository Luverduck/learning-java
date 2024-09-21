package part_01.chapter_03.s03_02.t02_02;

public class FloatingPointType {
    public static void main(String[] args) {

        // 부동소수점형(Floating-point Type)

        // float : 4[byte]
        float fFloat;
        float fFloatMin = 0x0.000002P-126f;
        float fFloatMAX = 0x1.fffffeP+127f;

        // double : 8[byte]
        double fDouble;
        double fDoubleMin = 0x1.fffffffffffffP+1023;
        double fDoubleMax = 0x0.0000000000001P-1022;

    }
}
