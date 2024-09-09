package s08_07.L07_01;

/**
 * 추상 클래스의 인스턴스 생성
 * 추상 클래스는 그 자체로 완전한 클래스가 아니므로 직접 인스턴스를 생성할 수 없다.
 * 오직 추상 클래스를 상속하여 추상 메소드가 구현된 하위 클래스를 통해 인스턴스를 생성할 수 있다.
 */

public class Main {
    public static void main(String[] args) {
        // ✅ 하위 클래스 Triangle를 통해 추상 클래스 Figure의 인스턴스 생성
        Figure figure1 = new Triangle("삼각형", 3, 4);
        // 추상 클래스 Figure의 메소드 호출
        figure1.printName();
        // 하위 클래스 Triangle에서 오버라이딩을 통해 구현된 추상 메소드 호출
        figure1.printArea();

        // ✅ 하위 클래스 Rectangle을 통해 추상 클래스 Figure의 인스턴스 생성
        Figure figure2 = new Rectangle("사각형", 3, 4);
        // 추상 클래스 Figure의 메소드 호출
        figure2.printName();
        // 하위 클래스 Rectangle에서 오버라이딩을 통해 구현된 추상 메소드 호출
        figure2.printArea();
    }
}