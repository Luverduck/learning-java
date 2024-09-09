package s08_03.L03_01;

/**
 * super 키워드
 * 상속 관계에 있는 두 클래스에 대하여
 * 하위 클래스에서 해당 클래스의 상위 클래스를 가리키는 참조 변수
 */

public class ToggleButton extends Button {
    // 필드 (Field)
    public boolean on;
    // 메소드 (Method)
    public void toggle() {
        this.on = !this.on;
        // ✅ super 키워드와 멤버 선택 연산자 '.'를 사용하여 상위 클래스의 멤버에 접근할 수 있다.
        System.out.println(super.name + " " + (on ? "켜짐" : "꺼짐"));
    }
    // 생성자 (Constructor)
    public ToggleButton(String name, boolean on) {
        // ✅ super 키워드와 소괄호 연산자 '()'를 사용하여 상위 클래스의 생성자에 접근할 수 있다.
        super(name);
        this.on = on;
    }
}
