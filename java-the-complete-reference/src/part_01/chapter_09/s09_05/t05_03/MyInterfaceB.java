package part_01.chapter_09.s09_05.t05_03;

public interface MyInterfaceB extends MyInterfaceA {

    // default 메소드 (Default Method)
    default void methodInterfaceDefault() {
        System.out.println("MyInterfaceB의 default 메소드 호출");
    };

}
