package s09_06.L06_02;

public interface MySubInterface extends MySuperInterface1, MySuperInterface2 {

    // ✅ 오버라이딩된 기본 메소드 (Default Method)
    @Override
    default void defaultMethod() {
        // ⭐ 메소드 호출의 모호성 해결
        // 1. 어떤 상위 인터페이스의 기본 메소드를 실행할 지 명시
        // MySuperInterface1.super.defaultMethod();
        // 2. 기본 메소드의 본문을 직접 정의
        System.out.println("MySubInterface의 기본 메소드 실행");
    }

}
