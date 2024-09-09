package s08_01;

/**
 * 클래스의 상속
 * 'extends' 키워드를 통해 기존 클래스를 새로운 클래스에 상속할 수 있다.
 * 기존 클래스를 상속받아 정의된 새로운 클래스는 기존 클래스의 모든 멤버를 그대로 사용할 수 있다.
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
