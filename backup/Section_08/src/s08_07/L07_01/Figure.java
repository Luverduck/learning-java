package s08_07.L07_01;

/**
 * 추상 클래스의 정의
 * 'class' 키워드 앞에 'abstract' 키워드를 사용하여 정의한다.
 * 추상 클래스는 인스턴스 필드, 인스턴스 메소드, 클래스 필드 외 추상 메소드를 멤버로 가질 수 있다.
 * 추상 메소드는 'abstract' 키워드로 선언된 메소드로, 메소드 시그니처만 정의되어 있다.
 * ⭐ 추상 클래스는 클래스 메소드를 멤버로 가질 수 없다.
 */

public abstract class Figure {
    // 필드 (Field)
    String figureName;

    // 메소드 (Method)
    void printName() {
        System.out.println("도형 : " + figureName);
    }

    // ✅ 추상 메소드 (Abstract Method)
    abstract void printArea();

    // 생성자 (Constructor)
    Figure(String figureName) {
        this.figureName = figureName;
    }
}