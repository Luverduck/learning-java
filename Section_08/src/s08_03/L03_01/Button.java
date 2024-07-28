package s08_03.L03_01;

public class Button {
    // 필드 (Field)
    public String name;
    // 메소드 (Method)
    public void print() {
        System.out.println(this.name);
    }
    // 생성자 (Constructor)
    public Button(String name) {
        this.name = name;
    }
}
