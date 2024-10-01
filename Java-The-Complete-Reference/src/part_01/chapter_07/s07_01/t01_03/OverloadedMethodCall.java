package part_01.chapter_07.s07_01.t01_03;

public class OverloadedMethodCall {
    public static void main(String[] args) {

        // 클래스의 인스턴스 생성
        MyClass m = new MyClass();

        // 오버로딩 된 메소드 호출
        m.method();
        m.method(1);
        m.method(1.5);
        m.method(1, 2);
        m.method(1, 1.5);

    }
}
