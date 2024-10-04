package part_01.chapter_07.s07_08.t08_01;

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
        }
    }

    // 정적 중첩 클래스 (Static Nested Class)
    static class StaticNestedClass {
        private String sFieldStaticNested = "정적 중첩 클래스의 필드";
        public void methodStaticNested() {
            System.out.println("정적 중첩 클래스의 메소드 호출");
        }
    }

}
