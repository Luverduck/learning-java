package S10_06.L06_01;

/**
 * 박싱 (Boxing)
 * 문자 원시 자료형을 문자형 래퍼 클래스의 인스턴스로 변환
 *
 * 언박싱 (Unboxing)
 * 문자 래퍼 클래스의 인스턴스를 문자 원시 자료형으로 변환
 */

public class CharacterBoxingUnboxing {
    public static void main(String[] args) {
        // ✅ 박싱 (Boxing)
        Character wChar = Character.valueOf('a');

        // ✅ 언박싱 (Unboxing)
        char pChar = wChar.charValue();
    }
}
