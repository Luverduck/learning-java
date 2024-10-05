package part_01.chapter_08.s08_01.t01_03;

public class ReferencingSubClassObject {
    public static void main(String[] args) {

        // 상위 클래스 타입의 참조 변수로 하위 클래스의 인스턴스 참조
        MyClassSuper ms = new MyClass();

        // 참조 변수는 하위 클래스에 상속된 상위 클래스의 멤버에만 접근할 수 있다.
        /*System.out.println("%s 접근".formatted(ms.sField));
        ms.method();*/
        System.out.println("%s 접근".formatted(ms.sFieldSuper));
        ms.methodSuper();

    }
}
