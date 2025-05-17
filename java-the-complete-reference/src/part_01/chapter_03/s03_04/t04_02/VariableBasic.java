package part_01.chapter_03.s03_04.t04_02;

public class VariableBasic {
    public static void main(String[] args) {

        // 1. 동일한 중괄호 블럭 안에서 변수의 식별자는 고유해야 한다.
        long iLong = 10L;
//      long iLong = 10L;
        // Variable 'iLong' is already defined in the scope

        // 2. 변수의 자료형과 호환되지 않는 값은 저장할 수 없다.
        int iInt;
        iInt = 10;
//      iInt = 1.5;         // java: incompatible types: possible lossy conversion from double to int
//      iInt = true;        // java: incompatible types: boolean cannot be converted to int
        iInt = 'A';

        double fDouble;
        fDouble = 10;
        fDouble = 1.5;
//      fDouble = true;     // java: incompatible types: boolean cannot be converted to double
        fDouble = 'A';

        boolean bBoolean;
//      bBoolean = 10;      // java: incompatible types: int cannot be converted to boolean
//      bBoolean = 1.5;     // java: incompatible types: int cannot be converted to boolean
        bBoolean = true;
//      bBoolean = 'A';     // java: incompatible types: int cannot be converted to boolean

        char cChar;
        cChar = 10;
//      cChar = 1.5;        // java: incompatible types: possible lossy conversion from double to char
//      cChar = true;       // java: incompatible types: boolean cannot be converted to char
        cChar = 'A';

        // 3. 초기화되지 않은 변수는 사용할 수 없다.
        float fFloat;
//      System.out.println(fFloat);
        // Variable 'fFloat' might not have been initialized

        // 4. 쉼표 연산자 ,를 사용하여 동일한 자료형의 변수를 한 줄에 여러 개 선언할 수 있다.
        byte iByte1, iByte2, iByte3; // 선언
        short iShort1 = 10, iShort2 = 20, iShort3 = 30; // 초기화

    }
}
