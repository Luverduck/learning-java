package part_01.chapter_08.s08_04.t04_02;

public class MethodOverriding {
    public static void main(String[] args) {

        // 하위 클래스 타입 변수로 하위 클래스의 인스턴스 참조
        MyClass m = new MyClass();
        // 오버라이딩 된 상위 클래스의 메소드 호출
        m.methodSuper();

        // 상위 클래스 타입 변수로 하위 클래스의 인스턴스 참조
        MyClassSuper ms = new MyClass();
        // 오버라이딩 된 상위 클래스의 메소드 호출
        ms.methodSuper();

        // 상위 클래스 타입 변수로 상위 클래스의 인스턴스 참조
        MyClassSuper mSuper = new MyClassSuper();
        // 상위 클래스의 메소드 호출
        mSuper.methodSuper();

    }
}
