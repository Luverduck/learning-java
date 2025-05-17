package part_01.chapter_03.s03_06.t06_01;

public class ArrayInitialization {
    public static void main(String[] args) {

        // 배열의 초기화

        // 정적 초기화
        // type[] var-name = initializer-list;
        int[] iArrayStatic = { 1, 2, 3 };

        // 동적 초기화
        // type[] var-name = new type[size];
        int[] iArrayDynamic = new int[3];             // { 0, 0, 0 }
        double[] fArrayDynamic = new double[3];       // { 0.0, 0.0, 0.0 }
        boolean[] bArrayDynamic = new boolean[3];     // { false, false, false }
        char[] cArrayDynamic = new char[3];           // { '', '', '' }
        // 초기화 리스트를 통한 동적 초기화
        // type[] var-name = new type[] initializer-list;
        int[] iArrayDynamicInit = new int[] { 1, 2, 3 };

    }
}
