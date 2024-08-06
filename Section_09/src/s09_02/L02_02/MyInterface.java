package s09_02.L02_02;

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
