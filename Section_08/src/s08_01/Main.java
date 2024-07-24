package s08_01;

/**
 * 상속 (Inheritance)
 * 기존 클래스를 재사용하여 새로운 클래스를 정의하는 것
 * 기존 클래스의 멤버를 새로운 클래스에서도 그대로 사용할 수 있다.
 * 또한 기존 클래스에 없는 멤버를 새로 정의할 수 있다는 점에서 클래스의 확장(Extend)라고도 한다.
 */

public class Main {
    public static void main(String[] args) {
        // Button 클래스를 상속받은 ToggleButton 클래스의 인스턴스 생성
        ToggleButton toggleButton = new ToggleButton();
        // ✅ 하위 클래스의 메소드 호출
        toggleButton.toggle();
        toggleButton.toggle();
        // ✅ 상위 클래스의 메소드 호출
        toggleButton.print();
    }
}
