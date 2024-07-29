package s08_05.L05_01;

public class SubClass extends SuperClass {
    // ✅ 상위 클래스에 정의된 print 메소드를 하위 클래스에서 재정의
    @Override
    void print() {
        System.out.println("하위 클래스의 print 메소드");
    }
}
