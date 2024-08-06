package s09_01.L01_02;

/**
 * 인터페이스의 구현
 * implements 키워드를 통해 인터페이스를 클래스에 상속할 수 있다.
 * 인터페이스를 클래스에 상속하는 과정을 인터페이스의 구현(implementation)이라 한다.
 * 인터페이스를 상속받은 클래스는 반드시 인터페이스의 추상 메소드를 구현해야 한다.
 */

public class MyClass implements MyInterface {

    // 필드 (Field)
    String cField = "클래스의 필드";

    // 메소드 (Method)
    @Override
    public void abstractMethod() {
        System.out.println(iField); // 인터페이스의 final 필드에 접근 가능
        System.out.println(cField);
    }

}
