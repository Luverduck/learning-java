package part_01.chapter_15.s15_07.t07_01;

public class ConstructorReference {
    public static void main(String[] args) {

        // 함수형 인터페이스 타입 변수로 MyClass의 생성자 참조
        MyFunction funcRefConstructor = MyClass::new;

        // 참조한 MyClass의 생성자를 실행하여 MyClass의 인스턴스 생성
        MyClass myClass = funcRefConstructor.execute();

    }
}
