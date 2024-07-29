package s08_04.L04_01;

/**
 * 생성자 호출 순서
 * 상속 관계에 있는 두 클래스에 대하여 하위 클래스의 인스턴스를 생성할 때
 * 상위 클래스의 생성자가 먼저 호출된 후 하위 클래스의 생성자가 호출된다.
 * 즉, 상위 클래스의 필드가 먼저 초기화된 후 하위 클래스의 필드가 초기화된다.
 */

public class Main {
    public static void main(String[] args) {
        // ✅ 하위 클래스의 인스턴스 생성
        SubClass subClass = new SubClass();
    }
}
