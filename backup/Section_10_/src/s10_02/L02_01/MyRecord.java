package s10_02.L02_01;

public record MyRecord(int rFieldInt, String rFieldStr) { // ✅ 필드 (Field)
    // ✅ 메소드 (Method)
    void rMethod() {
        System.out.println("레코드의 인스턴스 메소드 실행");
    }
    // ✅ 정적 필드 (Static Field)
    static int rFieldStatic = 10;
    // ✅ 정적 메소드 (Static Method)
    static void rMethodStatic() {
        System.out.println("레코드의 클래스 메소드 실행");
    }
}