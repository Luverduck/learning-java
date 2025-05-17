package part_01.chapter_09.s09_06.t06_01;

public class StaticMethod {
    public static void main(String[] args) {

        // MyInterface의 static 필드 접근
        System.out.println(MyInterface.sFieldInterface);
        System.out.println(MyInterface.sFieldInterface);

        // MyInterface의 static 메소드 접근
        MyInterface.methodInterfaceStatic();

    }
}
