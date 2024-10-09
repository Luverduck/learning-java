package part_01.chapter_09.s09_04.t04_06;

public class MyInterfaceSuperImpl implements MyInterfaceSuper {

    // MyInterfaceSuper의 추상 메소드 구현
    @Override
    public void methodInterfaceSuper() {
        System.out.println("MyInterfaceSuper의 구현된 메소드 호출");
    }
}
