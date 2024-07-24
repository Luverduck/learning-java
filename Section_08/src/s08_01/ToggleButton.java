package s08_01;

/**
 * 상위 클래스, 하위 클래스
 * 기존 클래스 A를 상속받아 정의된 클래스 B에 대하여 두 클래스 A와 B는 상속 관계에 있다고 한다.
 * 상속을 하는 클래스 A를 상위 클래스(Super Class) 또는 부모 클래스(Parent Class)라 하며
 * 상속을 받는 클래스 B를 하위 클래스(Sub Class) 또는 자식 클래스(Child Class)라 한다.
 */

// ✅ 하위 클래스 (Sub Class)
public class ToggleButton extends Button {
    // 필드 (Field)
    private boolean on;
    // 메소드 (Method)
    public void toggle() {
        this.on = !this.on;
        System.out.println(on ? "켜짐" : "꺼짐");
    }
    // 생성자 (Constructor)
    public ToggleButton() {
        this.on = false;
    }
}
