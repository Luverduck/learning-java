package part_01.chapter_08.s08_05.t05_01;

public class MyClass {

    String sField = "MyClass의 필드";
    void method() {
        System.out.println("MyClass의 오버로딩 된 메소드 호출");
    }
    void method(String sParam) {
        System.out.println("MyClass의 오버로딩 된 메소드 호출 [sParam = %s]".formatted(sParam));
    }

}
