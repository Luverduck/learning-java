package s09_02.L02_02;

/**
 * 기본 메소드의 오버라이딩
 * 기본 메소드는 메소드의 구현을 포함하므로 인터페이스를 구현하는 클래스에서 구현할 필요는 없다.
 * 이 경우 인터페이스에 정의된 기본 구현으로 동작한다.
 */

public class Main {
    public static void main(String[] args) {
        
        // 클래스형 인스턴스 생성 후 인터페이스형 변수로 참조
        MyInterface instance = new MyClass();
        
        // 클래스에서 구현된 추상 메소드 호출
        instance.abstractMethod();
        
        // ✅ 인터페이스에 정의된 기본 메소드 호출
        instance.defaultMethod();
        // ⭐
        // 인터페이스를 구현한 클래스에서 기본 메소드를 구현하지 않았으므로
        // 인터페이스에 정의된 기본 구현으로 동작한다.

    }
}
