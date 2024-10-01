package part_01.chapter_07.s07_06.t06_02;

public class MyClassExplicit {

    // 정적 필드의 명시적 초기화
    static int iFieldStatic = 100;
    static double fFieldStatic = 5.5;
    static boolean bFieldStatic = true;
    static char cFieldStatic = 'z';
    static String strStringStatic = "ZZZ";

    // 정적 필드 출력
    static void printStaticField() {
        System.out.println("iFieldStatic : %d".formatted(iFieldStatic));
        System.out.println("fFieldStatic : %f".formatted(fFieldStatic));
        System.out.println("bFieldStatic : %b".formatted(bFieldStatic));
        System.out.println("cFieldStatic : %c".formatted(cFieldStatic));
        System.out.println("strFieldStatic : %s".formatted(strStringStatic));
    }

}