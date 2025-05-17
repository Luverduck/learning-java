package part_01.chapter_03.s03_03.t03_04;

public class CharacterLiteral {
    public static void main(String[] args) {

        // 문자 리터럴 (Character Literal)
        
        // 문자 형태의 문자 리터럴
        char cChar = 'A';

        // 정수 형태의 문자 리터럴
        char cCharLetter = 'A'; // 'A' == 65
        char cCharInteger = 65;
        System.out.printf("%c %c\n", cCharLetter, cCharInteger);

        // 문자 리터럴의 기수
        // 10진수로 표현된 문자 리터럴
        char cChar10 = 74;
        // 16진수로 표현된 문자 리터럴
        char cChar16 = '\u004A';
        // 8진수로 표현된 문자 리터럴
        char cChar8 = '\112';
        System.out.printf("%c %c %c\n", cChar10, cChar16, cChar8);

    }
}
