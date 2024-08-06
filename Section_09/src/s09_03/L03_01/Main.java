package s09_03.L03_01;

/**
 * 정적 메소드 (Static Method)
 * Java 8 이후부터 인터페이스에 'static' 키워드로 정의된 정적 메소드를 포함할 수 있다.
 * 정적 메소드는 클래스를 통한 인스턴스 생성 없이 인터페이스만으로도 호출할 수 있다.
 */

public class Main {
    public static void main(String[] args) {

        // ✅ 정적 메소드 호출
        MyInterface.staticMethod();
        // 정적 메소드는 클래스를 통한 인스턴스 생성 없이 인터페이스만으로도 호출할 수 있다.

    }
}
