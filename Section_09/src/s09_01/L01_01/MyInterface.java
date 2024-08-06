package s09_01.L01_01;

/**
 * 인터페이스 (Interface)
 * 클래스가 구현해야 할 동작과 그에 필요한 상수를 포함하는 사용자 정의 자료형
 *
 * 인터페이스의 정의
 * 인터페이스는 'interface' 키워드를 이용하여 정의할 수 있다.
 * 인터페이스는 기본적으로 final 필드와 추상 메소드를 멤버로 가질 수 있다.
 * ⭐ 참고
 * - Java 8부터 정적 메소드를 멤버로 가질 수 있다.
 * - Java 8부터 default 키워드를 통해 구현이 포함된 온전한 메소드를 멤버로 가질 수 있다.
 * - Java 9부터 private 키워드로 선언된 메소드를 멤버로 가질 수 있다.
 */

public interface MyInterface {

    // ✅ final 필드
    final String interfaceField = "인터페이스의 final 필드";

    // ✅ 추상 메소드
    void print();

}
