package part_01.chapter_09.s09_06.t06_01;

public interface MyInterface {

    // 정적 필드 (Static Field)
    String sFieldInterface = "MyInterface의 필드";
    static String sFieldInterfaceStatic = "MyInterface의 static 필드";

    // 정적 메소드 (Static Method)
    static void methodInterfaceStatic() {
        System.out.println("MyInterface의 static 메소드 호출");
    }

}
