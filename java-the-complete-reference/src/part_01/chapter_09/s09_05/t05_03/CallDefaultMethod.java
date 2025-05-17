package part_01.chapter_09.s09_05.t05_03;

public class CallDefaultMethod {
    public static void main(String[] args) {

        // 동일한 식별자의 default 메소드를 포함하는 서로 다른 두 인터페이스가 상속 관계이며 하위 인터페이스를 구현하는 경우
        MyInterfaceA mia = new MyInterfaceImpl();
        mia.methodInterfaceDefault();   // 하위 인터페이스의 기본 구현으로 동작

        MyInterfaceB mib = new MyInterfaceImpl();
        mib.methodInterfaceDefault();   // 하위 인터페이스의 기본 구현으로 동작

    }
}
