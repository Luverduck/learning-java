package s03_01;

/**
 * 문자열 리터럴 (String Literal)
 * 문자가 연속적으로 나열된 값 자체를 의미한다.
 */

public class L01_06 {
    public static void main(String[] args) {
        // 특수 목적 문자열 (이스케이프 시퀀스, Escape Sequence)
        System.out.println("AB\tCD");   // AB	CD
        System.out.println("AB\'CD");   // AB'CD
        System.out.println("AB\"CD");   // AB"CD
        System.out.println("AB\\CD");   // AB\CD
        System.out.println("AB\nCD");   // AB
                                        // CD
        System.out.println("AB\fCD");   //
        System.out.println("AB\bCD");   // ACD
    }
}
