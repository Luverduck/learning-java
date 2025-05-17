package part_01.chapter_09.s09_07.t07_01;

public interface MyInterface {

    // private 메소드 (Private Method)
    private void methodInterfacePrivate() {
        System.out.println("MyInterface의 private 메소드 호출");
    };

    // 또 다른 private 메소드에서 private 메소드 호출
    private void methodInterfacePrivateCall() {
        methodInterfacePrivate();
    }

    // default 메소드에서 private 메소드 호출
    default void methodInterfaceDefault() {
        methodInterfacePrivate();
        methodInterfacePrivateCall();
    }

}
