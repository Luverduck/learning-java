package s08_02.L02_02;

import s08_02.Button;
import s08_02.ToggleButton;

/**
 * 클래스의 형 변환
 * 클래스의 형 변환은 상속 관계에 있는 클래스 사이의 형 변환만 허용된다.
 * 클래스의 형 변환은 다음 두 가지로 분류할 수 있다.
 * - 업 캐스팅 (Upcating)
 * - 다운 캐스팅 (Downcasting)
 */

public class Main {
    public static void main(String[] args) {
        // 다운 캐스팅 (Downcating)
        // 상위 클래스 인스턴스의 자료형을 하위 클래스 자료형으로 형 변환하는 것
        // 다운 캐스팅은 컴파일러에 의해 자동으로 수행되지 않으며 사용자가 직접 명시해야 한다.
        Button button = new Button();
        ToggleButton toggleButton = (ToggleButton)button;
        // 상위 클래스 멤버 접근 🟢
        toggleButton.print();
        // 하위 클래스 멤버 접근 🟢
        toggleButton.toggle();
    }
}
