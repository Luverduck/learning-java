package part_01.chapter_12.s12_02.t02_05;

public class CharacterWrapper {
    public static void main(String[] args) {

        // 문자 래퍼 클래스 (Character Wrapper Class)

        // 박싱 (Boxing)
        Character wCharBox = Character.valueOf('a');

        // 언박싱 (Unboxing)
        char pCharUnbox = wCharBox.charValue();

    }
}
