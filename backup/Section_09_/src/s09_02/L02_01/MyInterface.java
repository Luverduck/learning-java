package s09_02.L02_01;

/**
 * 기본 메소드 (Default Method)
 * 인터페이스 안에 'default' 키워드로 정의된 메소드
 * 기본 메소드는 인터페이스 안에서 메소드의 구현(implementation)을 포함할 수 있다.
 */

public interface MyInterface {

    // 필드 (Field)
    final String iField = "인터페이스의 final 필드";

    // 추상 메소드 (Abstract Method)
    void abstractMethod();

    // ✅ 기본 메소드 (Default Method)
    default void defaultMethod() {
        System.out.println("기본 메소드 실행");
    }

}
