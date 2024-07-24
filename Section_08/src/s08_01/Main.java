package s08_01;

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
