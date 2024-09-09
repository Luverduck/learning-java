package s08_05.L05_02;

/**
 * 오버라이딩된 메소드의 호출
 * 참조 변수로 메소드를 호출하면 참조 변수가 가리키는 인스턴스에 따라 호출할 메소드가 결정된다.
 */

public class Main {
    public static void main(String[] args) {
        // 상위 클래스의 인스턴스를 참조하는 상위 클래스형 참조 변수
        SuperClass superClass = new SuperClass();
        // ✅ 상위 클래스에 정의된 print 메소드 호출
        superClass.print();
        // 하위 클래스의 인스턴스를 참조하는 상위 클래스형 참조 변수
        SuperClass subClass = new SubClass();
        // ✅ 하위 클래스에 오버라이딩된 print 메소드 호출
        subClass.print();
    }
}
