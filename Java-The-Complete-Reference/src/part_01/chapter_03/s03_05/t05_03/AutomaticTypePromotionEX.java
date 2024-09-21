package part_01.chapter_03.s03_05.t05_03;

public class AutomaticTypePromotionEX {
    public static void main(String[] args) {

        // 자동 형 승격 (Automatic Type Promotion)
        char cChar = 'A'; // 65
        byte iByte = 1;
        short iShort = 2;
        int iInt = 3;
        long iLong = 4;
        float fFloat = 5.0f;
        double fDouble = 6.0;

        // 형 승격 과정
        double result = cChar + iByte + iShort + iInt + iLong + fFloat + fDouble;

        // 1. cChar와 iByte를 int형으로 승격 후 연산한다
        int step1 = (int)cChar + (int)iByte;

        // 2. iShort를 int형으로 승격 후 연산한다.
        int step2 = step1 + (int)iShort;

        // 3. int형간의 연산이므로 승격 없이 연산한다.
        int step3 = step2 + iInt;

        // 4. step3을 long형으로 승격 후 연산한다.
        long step4 = (long)step3 + iLong;

        // 5. step4를 float형으로 승격 후 연산한다.
        float step5 = (float)step4 + fFloat;

        // 6. step5를 double형으로 승격 후 연산한다.
        double step6 = (double)step5 + fDouble;

    }
}
