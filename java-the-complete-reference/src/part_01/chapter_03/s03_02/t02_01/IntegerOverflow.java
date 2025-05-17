package part_01.chapter_03.s03_02.t02_01;

public class IntegerOverflow {
    public static void main(String[] args) {

        // 정수 오버플로우 (Integer overflow)

        byte iByteMax = 127;
        System.out.println(iByteMax);
        iByteMax++;
        System.out.println(iByteMax);

        byte iByteMin = -128;
        System.out.println(iByteMin);
        iByteMin--;
        System.out.println(iByteMin);

        byte iByte = 127;
        System.out.println(iByte);
        iByte += 5;
        System.out.println(iByte);

    }
}
