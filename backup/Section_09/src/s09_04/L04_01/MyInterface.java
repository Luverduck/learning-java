package s09_04.L04_01;

/**
 * private 메소드
 * Java 9 이후부터 인터페이스에 'private' 키워드로 정의된 메소드를 포함할 수 있다.
 * 'private' 메소드는 기본 메소드 또는 인터페이스 내 또다른 'private' 메소드로만 호출할 수 있다.
 * - 정적 메소드는 인스턴스 메소드에 접근할 수 없으므로 'private' 메소드를 호출할 수 없다.
 */

public interface MyInterface {

    // 필드 (Field)
    final String iField = "인터페이스의 final 필드";

    // 추상 메소드 (Abstract Method)
    void abstractMethod();

    // 기본 메소드 (Default Method)
    default void defaultMethod() {
        System.out.println("기본 메소드 실행");
    }

    // 정적 메소드 (Static Method)
    static void staticMethod() {
        System.out.println("정적 메소드 실행");
    }

    // ✅ private 메소드
    private void privateMethod() {
        System.out.println("private 메소드 실행");
    }
    
}
