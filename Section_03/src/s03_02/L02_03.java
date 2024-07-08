package s03_02;

/**
 * 부동소수점형 (Floating-point type)
 * 부동소수점수를 다루는 자료형 (실수 자료형)
 */

public class L02_03 {
    public static void main(String[] args) {
        // 1) float     4[byte]     1.4e-045 ~ 3.4e+038
        float _4b_float;
        _4b_float   = Float.MIN_VALUE;
        _4b_float   = Float.MAX_VALUE;

        // 2) double    8[byte]     4.9e-324 ~ 1.8e+308
        double _8b_double;
        _8b_double  = Double.MIN_VALUE;
        _8b_double  = Double.MAX_VALUE;
    }
}
