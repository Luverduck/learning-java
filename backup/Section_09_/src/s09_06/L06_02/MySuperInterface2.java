package s09_06.L06_02;

public interface MySuperInterface2 {

    // 필드 (Field)
    final String iField = "MySuperInterface2의 final 필드";

    // 추상 메소드 (Abstract Method)
    void abstractMethod();

    // ✅ 기본 메소드 (Default Method)
    default void defaultMethod() {
        System.out.println("MySuperInterface2의 기본 메소드 실행");
    }

    // 정적 메소드 (Static Method)
    static void staticMethod() {
        System.out.println("MySuperInterface2의 정적 메소드 실행");
    }

    // private 메소드
    private void privateMethod() {
        System.out.println("MySuperInterface2의 private 메소드 실행");
    }

}
