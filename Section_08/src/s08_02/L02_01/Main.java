package s08_02.L02_01;

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
        // 업 캐스팅 (Upcasting)
        // 하위 클래스 인스턴스의 자료형을 상위 클래스 자료형으로 형 변환하는 것
        // 업 캐스팅은 컴파일러에 의해 자동으로 수행된다.
        Button button = new ToggleButton();
        // 상위 클래스 멤버 접근 🟢
        button.print();
        // 하위 클래스 멤버 접근 ❌
        //button.toggle();
    }
}
