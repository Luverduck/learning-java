package part_01.chapter_06.s06_02.t02_03;

public class ShallowCopy {
    public static void main(String[] args) {

        // 클래스의 인스턴스 생성 후 클래스형 참조 변수 m1으로 참조
        MyClass m1 = new MyClass();

        // 클래스형 참조 변수 m2 선언
        MyClass m2;

        // m1에 저장된 참조를 m2에 할당
        m2 = m1;

        // m1과 m2는 동일한 인스턴스를 참조
        System.out.println("m1 == m2 : %b".formatted(m1 == m2));

    }
}
