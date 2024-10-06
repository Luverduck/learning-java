package part_01.chapter_08.s08_06.t06_01;

public class AbstractClassInstantiation {
    public static void main(String[] args) {

        // 추상 클래스 타입 변수로 하위 클래스의 인스턴스 참조
        MyClassSuperAbstract msa = new MyClass();
        // 구현된 추상 메소드 호출
        msa.methodSuperAbstract();

    }
}
