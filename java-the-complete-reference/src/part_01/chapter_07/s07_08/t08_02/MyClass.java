package part_01.chapter_07.s07_08.t08_02;

public class MyClass {

    // 인스턴스 멤버 (Instance Member)
    private String sField = "외부 클래스의 필드";
    public void method() {
        System.out.println("외부 클래스의 메소드 호출");
    }

    // 클래스 멤버 (Class Member)
    private static String sFieldStatic = "외부 클래스의 정적 필드";
    public static void methodStatic() {
        System.out.println("외부 클래스의 정적 메소드 호출");
    }

    // 내부 클래스 (Inner Class)
    class InnerClass {
        private String sFieldInner = "내부 클래스의 필드";
        public void methodInner() {
            System.out.println("내부 클래스의 메소드 호출");
            // 내부 클래스에서 외부 클래스의 인스턴스 멤버 접근
            System.out.println("%s 접근".formatted(sField));
            method();
            // 내부 클래스에서 외부 클래스의 클래스 멤버 접근
            System.out.println("%s 접근".formatted(sFieldStatic));
            methodStatic();
        }
    }

}
