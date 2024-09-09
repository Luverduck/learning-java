package s08_07.L07_01;

/**
 * 추상 클래스의 상속
 * 추상 메소드는 추상 클래스를 상속한 하위 클래스에서 메소드 오버라이딩을 통해 구체화된다.
 * 추상 메소드의 실행 내용을 구체화하는 것을 추상 메소드의 구현(implementation)이라 한다.
 * 추상 클래스를 상속받은 하위 클래스는 반드시 추상 클래스에 있는 추상 메소드를 구현해야 한다.
 */

public class Rectangle extends Figure {
    // 필드 (Field)
    double length;
    double width;

    // ✅ 추상 메소드의 구현
    @Override
    void printArea() {
        System.out.println(this.length * this.width);
    }

    // 생성자 (Constructor)
    Rectangle(String figureName, double length, double width) {
        super(figureName);
        this.length = length;
        this.width = width;
    }
}