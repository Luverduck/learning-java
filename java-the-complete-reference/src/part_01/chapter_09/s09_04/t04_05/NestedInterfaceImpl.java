package part_01.chapter_09.s09_04.t04_05;

public class NestedInterfaceImpl implements MyClass.NestedInterface {

    // 중첩 인터페이스의 접근
    public void method() {
        System.out.println(MyClass.NestedInterface.sFieldInterfaceNested);
    }

    @Override
    public void methodInterfaceNested() {
        System.out.println("MyClass.NestedInterface의 구현된 메소드 호출");
    }

}
