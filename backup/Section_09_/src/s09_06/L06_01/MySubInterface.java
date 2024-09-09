package s09_06.L06_01;

public interface MySubInterface extends MySuperInterface {

    // ✅ 오버라이딩된 추상 메소드 (Abstract Method)
    @Override
    void abstractMethod();

    // ✅ 오버라이딩된 기본 메소드 (Default Method)
    @Override
    default void defaultMethod() {
        System.out.println("MySubInterface의 기본 메소드 실행");
    }

}
