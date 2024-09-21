package part_01.chapter_03.s03_05.t05_03;

public class AutomaticTypePromotion {
    public static void main(String[] args) {

        // 자동 형 승격 (Automatic Type Promotion)
        char cChar = 'A'; // 65
        byte iByte = 1;
        short iShort = 2;
        int iInt = 3;
        long iLong = 4;
        float fFloat = 5.0f;
        double fDouble = 6.0;

        // 1. byte, short, char형의 승격
        int case1 = cChar + iByte + iShort;

        // 2. 형 승격 순위가 높은 자료형으로 승격
        long case2_1 = cChar + iLong;
        float case2_2 = iLong + fFloat;
        double case2_3 = iLong + fFloat + fDouble;

    }
}
