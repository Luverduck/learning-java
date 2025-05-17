package part_01.chapter_03.s03_03.t03_02;

public class FloatingPointLiteral {
    public static void main(String[] args) {

        // 부동소수점 리터럴 (Floating-point Literal)
        
        // 부동소수점 리터럴의 자료형
        // float형 부동소수점 리터럴
        float fFloat = 1.0f;
        // double형 부동소수점 리터럴
        double fDouble = 1.0;

        // 부동소수점 리터럴의 기수
        double fDouble10 = 6.022E23;  // 6.022 * 10^23
        double fDouble16 = 0x12.2P2; // ( 16 + 2 + (1/8) ) * 2^2
        System.out.printf("%f %f", fDouble10, fDouble16);

    }
}
