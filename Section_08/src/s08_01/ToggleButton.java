package s08_01;

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
