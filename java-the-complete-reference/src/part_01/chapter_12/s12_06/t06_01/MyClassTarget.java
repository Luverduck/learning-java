package part_01.chapter_12.s12_06.t06_01;

// 클래스에 어노테이션 적용 ❌
//@MyAnnotationTarget
public class MyClassTarget {

    // 필드에 어노테이션 적용 ⭕
    @MyAnnotationTarget
    String sField = "MyClass의 필드";

    // 메소드에 어노테이션 적용 ⭕
    @MyAnnotationTarget
    void vMethod() {
        System.out.println("MyClass의 메소드 호출");
    }

    // 생성자에 어노테이션 적용 ⭕
    @MyAnnotationTarget
    MyClassTarget() {
        System.out.println("MyClass의 생성자 호출");
    }

}
