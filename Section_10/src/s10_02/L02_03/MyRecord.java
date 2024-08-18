package s10_02.L02_03;

public record MyRecord(int rFieldInt, String rFieldStr) // 필드 (Field)
        implements MyInterface      // 🟢 레코드는 인터페이스를 구현할 수 있다.
    {
    // 메소드 (Method)
    void rMethod() {
        System.out.println("레코드의 인스턴스 메소드 실행");
    }
    // 정적 필드 (Static Field)
    static int rFieldStatic = 10;
    // 정적 메소드 (Static Method)
    static void rMethodStatic() {
        System.out.println("레코드의 클래스 메소드 실행");
    }
    // ✅ 인터페이스의 추상 메소드 구현
    @Override
    public void iMethodAbstract() {
        System.out.println("레코드에서 구현된 추상 메소드 실행");
    }
}