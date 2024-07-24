package s08_02.L02_03;

import s08_02.Button;
import s08_02.ToggleButton;

/**
 * 클래스의 형 변환과 멤버 접근
 * 클래스의 인스턴스가 접근할 수 있는 멤버는 해당 인스턴스 변수의 참조 자료형에 의해 결정된다.
 */

public class Main {
    public static void main(String[] args) {
        // ✅ 업 캐스팅된 인스턴스 변수는 상위 클래스의 인스턴스 멤버만 접근할 수 있다.
        Button button = new ToggleButton();
        // - 상위 클래스 멤버 접근 🟢
        button.print();
        // - 하위 클래스 멤버 접근 ❌
        //button.toggle();

        // ✅ 다운 캐스팅된 인스턴스 변수는 하위 클래스의 인스턴스 멤버만 접근할 수 있다
        ToggleButton toggleButton = (ToggleButton)button;
        // - 상위 클래스 멤버 접근 🟢
        toggleButton.print();
        // - 하위 클래스 멤버 접근 🟢
        toggleButton.toggle();
    }
}
