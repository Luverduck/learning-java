package s10_02.L02_03;

public interface MyInterface {
    // 필드 (Field)
    final String iFieldStr = "인터페이스의 final 필드";
    // 추상 메소드 (Abstract Method)
    void iMethodAbstract();
    // 기본 메소드 (Default Method)
    default void iMethodDefault() {
        System.out.println("인터페이스의 기본 메소드 실행");
    }
    // 정적 메소드 (Static Method)
    static void iMethodStatic() {
        System.out.println("인터페이스의 정적 메소드 실행");
    }
    // private 메소드 (Private Method)
    private void iMethodPrivate() {
        System.out.println("인터페이스의 private 메소드 실행");
    }
}
