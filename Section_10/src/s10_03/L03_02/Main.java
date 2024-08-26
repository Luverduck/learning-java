package s10_03.L03_02;

/**
 * 박싱(Boxing)과 언박싱(Unboxing)
 * 원시 자료형을 래퍼 클래스의 인스턴스로 변환하는 것을 박싱(boxing)이라 한다.
 * 래퍼 클래스의 인스턴스를 원시 자료형으로 변환하는 것을 언박싱(unboxing)이라 한다.
 */

public class Main {
    public static void main(String[] args) {
        // ✅ 박싱(Boxing)
        // 원시 자료형 값을 박싱
        Integer wrapper = Integer.valueOf(123);
        // 원시 자료형 값의 문자열을 박싱
        Integer wrapper_string = Integer.valueOf("123");

        // ✅ 언박싱(Unboxing)
        // 래퍼 클래스의 인스턴스를 원시 자료형으로 언박싱
        int primitive = wrapper.intValue();
    }
}
