package s09_02.L02_02;

public class MyClass implements MyInterface {

    // 필드 (Field)
    String cField = "클래스의 필드";

    // 메소드 (Method)
    @Override
    public void abstractMethod() {
        System.out.println("구현된 추상 메소드 실행");
    }

}
