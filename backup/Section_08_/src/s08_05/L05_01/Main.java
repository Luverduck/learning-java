package s08_05.L05_01;

/**
 * 메소드 오버라이딩 (Method Overriding)
 * 상속 관계에 있는 두 클래스에 대하여 상위 클래스의 메소드를 하위 클래스에서 재정의하는 것
 */

public class Main {
    public static void main(String[] args) {
        // 하위 클래스의 인스턴스 생성
        SubClass subClass = new SubClass();
        // ✅ 하위 클래스에 오버라이딩된 print 메소드 호출
        subClass.print();
    }
}
