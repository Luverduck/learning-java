package part_01.chapter_09.s09_05.t05_01;

public interface MyInterface {
    
    // default 메소드 (Default Method)
    default void methodInterfaceDefault() {
        System.out.println("MyInterface의 default 메소드 호출");
    }
    
}
