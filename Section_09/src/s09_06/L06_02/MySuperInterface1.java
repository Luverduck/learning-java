package s09_06.L06_02;

public interface MySuperInterface1 {

    // 필드 (Field)
    final String iField = "MySuperInterface1의 final 필드";

    // 추상 메소드 (Abstract Method)
    void abstractMethod();

    // ✅ 기본 메소드 (Default Method)
    default void defaultMethod() {
        System.out.println("MySuperInterface1의 기본 메소드 실행");
    }

    // 정적 메소드 (Static Method)
    static void staticMethod() {
        System.out.println("MySuperInterface1의 정적 메소드 실행");
    }

    // private 메소드
    private void privateMethod() {
        System.out.println("MySuperInterface1의 private 메소드 실행");
    }

}
