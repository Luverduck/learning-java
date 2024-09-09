package s08_02;

public class Button {
    // 필드 (Field)
    private String name;
    // 메소드 (Method)
    public void print() {
        System.out.println(this.name);
    }
    // 생성자 (Constructor)
    public Button() {
        this.name = "버튼";
    }
}
