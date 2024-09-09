package s10_05.L05_01;

/**
 * 박싱 (Boxing)
 * 논리 원시 자료형을 논리형 래퍼 클래스의 인스턴스로 변환
 *
 * 언박싱 (Unboxing)
 * 논리 래퍼 클래스의 인스턴스를 논리 원시 자료형으로 변환
 */

public class BooleanBoxingUnboxing {
    public static void main(String[] args) {
        // ✅ 박싱 (Boxing)
        Boolean wBoolean = Boolean.valueOf(true);

        // ✅ 언박싱 (Unboxing)
        boolean pBoolean = wBoolean.booleanValue();
    }
}
