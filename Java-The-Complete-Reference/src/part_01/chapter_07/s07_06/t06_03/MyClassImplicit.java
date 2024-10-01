package part_01.chapter_07.s07_06.t06_03;

public class MyClassImplicit {
    
    // 정적 필드의 암시적 초기화
    static int iFieldStatic;
    static double fFieldStatic;
    static boolean bFieldStatic;
    static char cFieldStatic;
    static String strStringStatic;

    // 정적 필드 출력
    static void printStaticField() {
        System.out.println("iFieldStatic : %d".formatted(iFieldStatic));
        System.out.println("fFieldStatic : %f".formatted(fFieldStatic));
        System.out.println("bFieldStatic : %b".formatted(bFieldStatic));
        System.out.println("cFieldStatic : %c".formatted(cFieldStatic));
        System.out.println("strFieldStatic : %s".formatted(strStringStatic));
    }

}
