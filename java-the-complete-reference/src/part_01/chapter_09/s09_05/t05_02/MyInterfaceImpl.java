package part_01.chapter_09.s09_05.t05_02;

public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {

    // default 메소드의 오버라이딩
    @Override
    public void methodInterfaceDefault() {
        System.out.println("MyInterface의 오버라이딩 된 메소드 호출");
    }

}
