package part_01.chapter_07.s07_08.t08_04;

public class MyClass {

    // 인스턴스 멤버 (Instance Member)
    private String sField = "외부 클래스의 필드";
    public void method() {
        System.out.println("외부 클래스의 메소드 호출");
        // 외부 클래스의 인스턴스 멤버에서 내부 클래스의 멤버 접근
        InnerClass inner = new InnerClass();
        System.out.println("%s 접근".formatted(inner.sFieldInner));
        inner.methodInner();
        // 외부 클래스의 인스턴스 멤버에서 정적 중첩 클래스의 멤버 접근
        StaticNestedClass staticNested = new StaticNestedClass();
        System.out.println("%s 접근".formatted(staticNested.sFieldStaticNested));
        staticNested.methodStaticNested();
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
