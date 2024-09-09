package s10_06.L06_01;

/**
 * 문자형 래퍼 클래스의 기타 메소드
 * - 문자 분류 함수
 * - 문자 변환 함수
 */

public class CharacterETC {
    public static void main(String[] args) {
        char pChar = 'a';

        // ✅ 문자 분류 함수
        System.out.printf(
                "[%c] : L: %b, U: %b, L: %b, D: %b, S: %b%n",
                pChar,
                Character.isLetter(pChar),
                Character.isUpperCase(pChar),
                Character.isLowerCase(pChar),
                Character.isDigit(pChar),
                Character.isSpaceChar(pChar)
        );

        // ✅ 문자 변환 함수
        System.out.printf(
                "toUpper() : %c\n",
                Character.toUpperCase(pChar)
        );

        System.out.printf(
                "toLower() : %c\n",
                Character.toLowerCase(pChar)
        );
    }
}
