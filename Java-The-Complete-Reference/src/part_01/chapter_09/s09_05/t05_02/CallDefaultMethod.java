package part_01.chapter_09.s09_05.t05_02;

public class CallDefaultMethod {
    public static void main(String[] args) {

        // 동일한 식별자의 default 메소드를 포함하는 서로 다른 두 인터페이스를 동시에 구현하는 경우
        MyInterfaceA mia = new MyInterfaceImpl();
        mia.methodInterfaceDefault();   // 오버라이딩 된 구현으로 동작

        MyInterfaceA mib = new MyInterfaceImpl();
        mib.methodInterfaceDefault();   // 오버라이딩 된 구현으로 동작

    }
}
