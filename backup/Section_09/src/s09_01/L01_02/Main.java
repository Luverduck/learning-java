package s09_01.L01_02;

public class Main {
    public static void main(String[] args) {

        // 클래스형 인스턴스 생성 후 인터페이스형 변수로 참조
        MyInterface instance = new MyClass();

        // 인터페이스의 final 필드 접근
        System.out.println(instance.iField);

        // 클래스에서 구현된 추상 메소드 호출
        instance.abstractMethod();

    }
}
